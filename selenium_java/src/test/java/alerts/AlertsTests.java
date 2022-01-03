package alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.Base;

public class AlertsTests extends Base{
	
	@Test
	public void testAcceptAlert() {
		var alertsPage= lp.clickJavaScriptAlerts();		  
		alertsPage.triggerAlert();
	    alertsPage.alert_clickToAccept();	
	    assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Results text incorrect");
	}
	
	
	@Test
	public void testGetTextFromAlert(){

	    var alertsPage = lp.clickJavaScriptAlerts();
	    alertsPage.triggerConfirm();

	    String text = alertsPage.alert_getText();
	    alertsPage.alert_clickToDismiss();

	    assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
	}
	
	@Test
	public void testSetInputInAlert(){

	    var alertsPage = lp.clickJavaScriptAlerts();
	    alertsPage.triggerPrompt();

	    String text = "Mangalam rocks!";
	    alertsPage.alert_setInput(text);
	    alertsPage.alert_clickToAccept();

	    assertEquals(alertsPage.getResult(), text, "Results text incorrect");
	}
}