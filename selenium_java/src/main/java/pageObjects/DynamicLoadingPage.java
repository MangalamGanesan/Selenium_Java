package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DynamicLoadingPage {
	
	private WebDriver driver;
	
	public DynamicLoadingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * private String linkXpath_Format = ".//a[contains(text(), '%s')]"; private By
	 * link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
	 * private By link_Example2 = By.xpath(String.format(linkXpath_Format,
	 * "Example 2"));
	 */
	
	@FindBy(xpath= ".//a[contains(text(), 'Example 1')]")
	private WebElement link_Example1;
	
	@FindBy(xpath=".//a[contains(text(), 'Example 2')]")
	private WebElement link_Example2;
	
   
   
	
    public DynamicLoadingExample1Page clickExample1(){
        link_Example1.click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        link_Example2.click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page rightClickOnExample2Link(){
        link_Example2.sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }


}
