package forgotpassword;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.ForgotPasswordPage;

public class ForgotPasswordTests extends Base {
	
	@Test	
	public void retrievePasswordTests()
	{
		var ForgotPasswordPage =lp.clickForgotPassword();
		var EmailSentPage = ForgotPasswordPage.retrievePassword("mangalam320@gmail.com");
		ForgotPasswordPage.clickRetrievePassword();
		
		assertEquals(EmailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");
	}

}
