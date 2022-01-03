package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {
	
	private WebDriver driver;

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement userName;
	
	public void setUserName(String username) {
		userName.sendKeys(username);
	}
	
	@FindBy(id = "password")
	private WebElement passWord;
	
	public void setPassWord(String pwd) {
		passWord.sendKeys(pwd);
	}
	
	@FindBy(css = "#login button")
	private WebElement loginButton;
	
	public SecurePage clickLogin() {
		loginButton.click();
		return new SecurePage(driver);
	}
	
	
	@FindBy(id = "flash")
	private WebElement errorText;
	
	public String getErrorText() {
		
		return errorText.getText();
	}

	
	
}
