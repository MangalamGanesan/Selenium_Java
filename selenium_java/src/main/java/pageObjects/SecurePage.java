package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePage {
	
	private WebDriver driver;
	public SecurePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Logout")
	private WebElement logOut;
	
	public void logOut()
	{
		logOut.click();
	}
	
	@FindBy(id = "flash")
	private WebElement message;
	
	public String getAlertText()
	{
		return message.getText();
	}
	

}
