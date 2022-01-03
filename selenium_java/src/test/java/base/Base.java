package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.google.common.io.Files;

import pageObjects.LandingPage;
import utils.WindowsManager;


public class Base {
	private WebDriver driver;
	
	//private EventFiringDecorator driver;
	
	protected LandingPage lp;

	@BeforeClass
	public void setUp() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\manga\\eclipse-workspace\\learning\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("Browser");	
		

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manga\\eclipse-workspace\\learning\\resources\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\manga\\eclipse-workspace\\learning\\resources\\geckodriver.exe");
				}
		goHome();		
	}
	
	@BeforeMethod
	public void goHome(){
		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		lp=new LandingPage(driver);	
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}
	
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

	
	   public WindowsManager getWindowManager(){
	        return new WindowsManager(driver);
	    }

	    private ChromeOptions getChromeOptions(){
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-infobars");
	        //options.setHeadless(true);
	        return options;
	    }

	  
}