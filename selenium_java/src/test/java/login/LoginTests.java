package login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.LoginPage;
import pageObjects.SecurePage;

public class LoginTests extends Base {
	
	@Test
	public void testSuccessfulLogin() {
		LoginPage log= lp.clickFormAuthentication();
		log.setUserName("tomsmith");
		log.setPassWord("SuperSecretPassword!");
		SecurePage sp=log.clickLogin();
		assertTrue(sp.getAlertText().contains("You logged into a secure area!"), "Alert text is incorrect");
		sp.logOut();
	}
	
	@Test
	public void testUnSuccessfulLogin() {
		LoginPage log= lp.clickFormAuthentication();
		log.setUserName("tomsmith");
		log.setPassWord("SuperSecretPassword");
		SecurePage sp=log.clickLogin();
		assertTrue(log.getErrorText().contains("Your password is invalid!"), "Login Unsuccessful");		
	}
}