package windows;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.Base;

public class WindowsTests extends Base{
	
    @Test
    public void testWindowTabs(){
        var buttonPage = lp.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }

}
