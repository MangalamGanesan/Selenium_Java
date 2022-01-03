package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	private WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickFormAuthentication() {
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}

	public DropDownPage clickDropDown() {
		clickLink("Dropdown");
		return new DropDownPage(driver);
	}

	public ForgotPasswordPage clickForgotPassword() {
		clickLink("Forgot Password");
		return new ForgotPasswordPage(driver);
	}

	public KeyPressesPage clickKeyPresses() {
		clickLink("Key Presses");
		return new KeyPressesPage(driver);
	}	
	
	public HorizontalSliderPage clickHorizontalSlider() {
		clickLink("Horizontal Slider");
		return new HorizontalSliderPage(driver);
	}
	public AlertsPage clickJavaScriptAlerts(){

	    clickLink("JavaScript Alerts");
	    return new AlertsPage(driver);
	}
	public FileUploadPage clickFileUpload(){
	    clickLink("File Upload");
	    return new FileUploadPage(driver);
	}
	public FramesPage clickFrames(){
	    clickLink("Frames");
	    return new FramesPage(driver);
	}
	
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

	
	private void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
}