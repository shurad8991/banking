package com.bankingproject.testclass;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.bankingproject.pageobjectclass.BaseClass1;
import com.bankingproject.pageobjectclass.loginpage;

public class TC_login_002 extends BaseClass1{

	@Test
	public void loginTest() throws Exception {
		driver.get(baseURL);
		test=extent.createTest("verify application login");
		
		loginpage login = new loginpage(driver);
		login.setUsername(username);
		test.log(Status.PASS, "Username Entered");
		login.setPassword(password);
		test.log(Status.PASS, "Password Entered");
		login.loginButn();
		System.out.println("2222222");
		test.log(Status.PASS, "Login button clicked");
		if (driver.getTitle().equals("GTPL Bank Manager HomePage****"))
		{
			test.log(Status.PASS, "Login correct");
		} else {
			test.log(Status.PASS, "Incorrect Login");
			String screenshotpath=BaseClass1.screenshot();
			test.addScreenCaptureFromPath(screenshotpath);
		}
	}
}
