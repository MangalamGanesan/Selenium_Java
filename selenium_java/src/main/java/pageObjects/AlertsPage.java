package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
	
	private WebDriver driver;
	
	public AlertsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = ".//button[text()=\"Click for JS Alert\"]")
	private WebElement triggerAlertButton;
	
	
	@FindBy(id = "result")
	private WebElement results;
	
	@FindBy(xpath=".//button[text()='Click for JS Confirm']")
	private WebElement triggerConfirmButton;	
	
	@FindBy(xpath=".//button[text()='Click for JS Prompt']")
	private WebElement triggerPromptButton;
	

	public void triggerAlert(){
		triggerAlertButton.click();
	}
	
	public String getResult(){
	    return results.getText();
	}
	
	public void triggerConfirm(){
	    triggerConfirmButton.click();
	}

	public void alert_clickToAccept(){
	    driver.switchTo().alert().accept();
	}
	
	public void alert_clickToDismiss(){
	    driver.switchTo().alert().dismiss();
	}
	
	public String alert_getText(){
	    return driver.switchTo().alert().getText();
	}
	
	public void triggerPrompt(){
	    triggerPromptButton.click();
	}
	
	public void alert_setInput(String text){
	    driver.switchTo().alert().sendKeys(text);
	}
	

}
