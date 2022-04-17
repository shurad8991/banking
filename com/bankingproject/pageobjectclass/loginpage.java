package com.bankingproject.pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
WebDriver d;
	
	@FindBy(name = "uid")
	WebElement userId;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "btnLogin")
	WebElement btnlogin;
	public loginpage(WebDriver d1) {
		d=d1;
		PageFactory.initElements(d1, this);
	}
	public void setUsername(String name) // method for username
	{
		userId.sendKeys(name);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void loginButn()
	{
		btnlogin.click();
	}

}
