package frames;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.Base;

public class FrameTests extends Base {
	
    @Test
    public void testFrameText() {
        var nestedFramesPage = lp.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }

}
