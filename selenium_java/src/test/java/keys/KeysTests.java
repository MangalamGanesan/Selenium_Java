package keys;

import static org.testng.Assert.*;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.KeyPressesPage;
import pageObjects.LoginPage;

public class KeysTests extends Base {

	@Test
	public void testSuccessfulLogin() {
		KeyPressesPage key = lp.clickKeyPresses();
		key.enterText("A" + Keys.BACK_SPACE);
		assertEquals(key.getResult(), "You entered: BACK_SPACE");
	}
}