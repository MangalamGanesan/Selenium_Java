package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {
	
	private WebDriver driver;
	
	public FramesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Nested Frames")
	private WebElement nestedFrames;
	
	 public NestedFramesPage clickNestedFrames(){
		 nestedFrames.click();
	        return new NestedFramesPage(driver);
	    }


}
