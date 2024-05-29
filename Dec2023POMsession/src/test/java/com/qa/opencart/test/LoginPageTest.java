package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.factory.DriverFactory;

public class LoginPageTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actTitle, "Account Login");
	}
	
	@Test(priority = 2)
	public void loginPageURLTest() {
		String actURL = loginPage.getLoginPageURL();
		Assert.assertTrue(actURL.contains("route=account/login"));
	}
	
	@Test(priority = 3)
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isforgotPwdLinkExist());
	
	}
	@Test(priority = 4)
	public void logingTest() {
		String accPageTitle = loginPage.doLogin("decsession32@gmail.com", "Dec@1234");
		Assert.assertEquals(accPageTitle, "My Account");
	}
	
	

}
