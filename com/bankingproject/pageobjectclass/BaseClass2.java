package com.bankingproject.pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;

import com.bankingproject.utilities.readconfig;

public class BaseClass2 {
	readconfig r=new readconfig();
	public String aURL =r.addcustURL();
	public String cname =r.cname();
	public String dob =r.dob();
	public String addr =r.addr();
	public String city =r.city();
	public String state =r.state();
	public String pin =r.pin();
	public String tno =r.tno();
	public String email =r.email();
	public static WebDriver driver;
	@BeforeClass
	public void setup(@Optional("chrome") String str)
	{
		if(str.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		}
		if(str.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:/drivers/mozilla/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("Close");
	//driver.quit();
	}

}
