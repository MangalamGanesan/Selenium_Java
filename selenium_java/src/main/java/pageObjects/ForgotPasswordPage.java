package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class ForgotPasswordPage {
	
	private WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement eMail;
	
	public void enterEmail(String email)
	{
		eMail.sendKeys(email);
	}
	
	@FindBy(id = "form_submit")
	private WebElement retrievePassword;
	
	public EmailSentPage clickRetrievePassword()
	{
		retrievePassword.click();
		return new EmailSentPage(driver);
	}
	
    public EmailSentPage retrievePassword(String email){
        enterEmail(email);
        return clickRetrievePassword();
    }
}