package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {
	private WebDriver driver;
	
	public HorizontalSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#content input")
	private WebElement slider;
	
	public void setSliderValue(String value){
        while(!getRange().equals(value)){
        	slider.sendKeys(Keys.ARROW_RIGHT);;
        }
    }
	
	@FindBy(id = "range")
	private WebElement range;
	
	public String getRange() {
		return range.getText();
	}
}