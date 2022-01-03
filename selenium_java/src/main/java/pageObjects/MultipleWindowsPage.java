package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage {
	
	   private WebDriver driver;
	   
	   @FindBy(linkText="Click Here")
	    private By clickHereLink;

	    public MultipleWindowsPage(WebDriver driver){
	        this.driver = driver;
	    }

	    public void clickHere(){
	        driver.findElement(clickHereLink).click();
	    }

}