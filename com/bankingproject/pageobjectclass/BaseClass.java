package com.bankingproject.pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.bankingproject.utilities.readconfig;


public class BaseClass {
	public String baseURL = "https://demo.guru99.com/V1/index.php";
	public String username = "mngr397771"; 
	public String password = "gatYtUv";
	
	
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	public void closebrowser()
	{
	driver.quit();
	}

}
