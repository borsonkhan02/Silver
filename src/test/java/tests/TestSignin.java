package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestSignin extends TestBase {

	@BeforeClass
	public void classSetUp(){
		
		menuBar.signinLink.click();
	}
	@Test
	public void testWithValidOption(){
	
		signinPage.signin("shakil_ipe@yahoo.com", "365827");
		
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertTrue(currentUrl.contains("/profile."));
		
		menuBar.logoutLink.click();
		
		menuBar.signinLink.click();
		
	
	}
	@Test
	public void testWithInvalidOption(){
		
		signinPage.signin(" ", " ");
		
		String emailError = signinPage.errorList.get(0).getText();
		String passwordError = signinPage.errorList.get(1).getText();
		
		Assert.assertEquals(emailError, "*");
		Assert.assertEquals(passwordError, "*");
		
	}
	@Test
	public void testWithvalidEmailInvalidPssword(){
		
		signinPage.signin("shakil_ipe@yahoo.com", "1010");
		
		String emailOk = signinPage.errorList.get(0).getText();
		
		String passwordError = signinPage.errorList.get(1).getText();
		
		Assert.assertEquals(emailOk, "* Email or Password is incorrect.");
	
		Assert.assertEquals(passwordError,"*");
		
	
	}
}
