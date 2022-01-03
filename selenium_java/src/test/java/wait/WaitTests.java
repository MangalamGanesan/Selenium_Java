package wait;


import org.testng.annotations.Test;

import base.Base;

import static org.testng.Assert.assertEquals;

public class WaitTests extends Base {

    @Test
    public void testWaitUntilVisible(){
        var loadingPage = lp.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}