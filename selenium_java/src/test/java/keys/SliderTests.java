package keys;

import static org.testng.Assert.assertEquals;



import org.testng.annotations.Test;

import base.Base;

public class SliderTests extends Base{
	
	@Test
	public void TestHorizontalSlider() {
		var horizontalSlider=lp.clickHorizontalSlider();
		String value = "4";
		horizontalSlider.setSliderValue(value);		
		assertEquals(horizontalSlider.getRange(), value, "Slider value is incorrect");		
	}
}