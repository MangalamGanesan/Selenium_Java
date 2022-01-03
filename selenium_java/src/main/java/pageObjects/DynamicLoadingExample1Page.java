package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {
	
	private WebDriver driver;
	
	public DynamicLoadingExample1Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#start button")
    private WebElement startButton;
	
	@FindBy(id ="loading")
    private WebElement loadingIndicator;
	
	@FindBy(id ="finish")
    private By loadedText;

	
	  public void clickStart(){
	        startButton.click();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.invisibilityOf(loadingIndicator));

	        /* FLUENT WAIT */
//	        FluentWait wait = new FluentWait(driver)
//	                .withTimeout(Duration.ofSeconds(5))
//	                .pollingEvery(Duration.ofSeconds(1))
//	                .ignoring(NoSuchElementException.class);
//	        wait.until(ExpectedConditions.invisibilityOf(
//	                driver.findElement(loadingIndicator)));

	    }

	    public String getLoadedText(){
	        return driver.findElement(loadedText).getText();
	    }

}
