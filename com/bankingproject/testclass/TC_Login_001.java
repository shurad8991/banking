package com.bankingproject.testclass;

import org.testng.annotations.Test;

import com.bankingproject.pageobjectclass.BaseClass;
import com.bankingproject.pageobjectclass.BaseClass1;
import com.bankingproject.pageobjectclass.loginpage;
import com.bankingproject.pageobjectclass.loginpage1;

public class TC_Login_001 extends BaseClass {
	
	@Test
	public void loginTest() {
		driver.get(baseURL);
		loginpage login = new loginpage(driver);
		login.setUsername(username);
		login.setPassword(password);
		login.loginButn();
		if (driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
		System.out.println("title is correct");
		} else {
		System.out.println("Not correct");
		}
	}
}

