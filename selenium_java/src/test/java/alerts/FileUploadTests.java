package alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.Base;

public class FileUploadTests extends Base {
	
	   @Test
	    public void testFileUpload(){
		   
	        var uploadPage = lp.clickFileUpload();
	        uploadPage.uploadFile("C:\\Users\\manga\\eclipse-workspace\\learning\\resources\\chromedriver.exe");
	        
	        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");
	    }

}
