package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailSentPage {
	
	private WebDriver driver;
	
	
	
	public EmailSentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


    @FindBy(id = "content")
	private WebElement contentArea;

	  public String getMessage(){
	        return contentArea.getText();
	    }

}
