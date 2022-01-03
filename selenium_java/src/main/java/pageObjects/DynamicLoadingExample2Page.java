package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {
	
	private WebDriver driver;
	
	public DynamicLoadingExample2Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#start button")
	private WebElement startButton;
	
	@FindBy(id="finish")
	private WebElement loadedText;
    
    public void clickStart() {
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
    }

    public boolean isStartButtonDisplayed(){
        return startButton.isDisplayed();
    }

    public String getLoadedText(){
        return loadedText.getText();
    }

}
