package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.DropDownPage;

public class DropDownTests extends Base {
	
	@Test
	public void selectDropDown() {
		String option ="Option 1" ;
		var dropDownPage =lp.clickDropDown();
		dropDownPage.findDropdownElement();
		dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
		
		
		
	}

}
