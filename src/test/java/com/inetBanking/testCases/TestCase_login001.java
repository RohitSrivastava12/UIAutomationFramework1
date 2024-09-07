package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.loginPage;

public class TestCase_login001 extends baseClass {

	@Test
	public void loginTest() {

		loginPage lp = new loginPage(driver);
		lp.setUsername(usname);
		Logger.info("Entered username");
		lp.setPassword(passwd);
		Logger.info("Entered Password");
		lp.clicklogin();
		Logger.info("Clicked on submit button");

		if (driver.getTitle().equals(expTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

}
