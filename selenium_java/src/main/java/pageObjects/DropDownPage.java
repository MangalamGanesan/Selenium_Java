package pageObjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;


public class DropDownPage {
	
	private WebDriver driver;
	
	public DropDownPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "dropdown")
	private WebElement dropDown;
	
	public Select findDropdownElement()
	{
		Select select = new Select(dropDown);
		return select;
	}
	
	 public void selectFromDropDown(String option){
		 findDropdownElement().selectByVisibleText(option);
	    }
	 
	   public List<String> getSelectedOptions(){
	        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
	        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
	    }

	 

}
