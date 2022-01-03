package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesPage {

	private WebDriver driver;

	public KeyPressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "target")
	private WebElement inputText;

	public void enterText(String text) {
		inputText.sendKeys(text);
	}

	@FindBy(id = "result")
	private WebElement resultText;

	public String getResult() {
		return resultText.getText();
	}
}