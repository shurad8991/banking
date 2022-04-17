package com.bankingproject.pageobjectclass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.bankingproject.utilities.readconfig;

public class BaseClass1 {
	readconfig r=new readconfig();
	public String baseURL =r.geturl();
	public String username =r.getuname();
	public String password =r.getpass();
	
	public static WebDriver driver;
	public static ExtentSparkReporter sparkreporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	@BeforeSuite
	public void setReport()
	{
		sparkreporter=new ExtentSparkReporter("C:\\Users\\Administrator\\eclipse-workspace\\bankingproject\\reports\\html1.html");
		extent=new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("O.S.","Windows");
		extent.setSystemInfo("environment", "QA");
		sparkreporter.config().setReportName("Integration test execution");
		sparkreporter.config().setDocumentTitle("QA Automation testing report");
		sparkreporter.config().setTheme(Theme.STANDARD);
		System.out.println("11111");
		
		
	}
	
	
	@Parameters("browser")
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
	driver.quit();
	}
	@AfterSuite
	public void endreport() 
	{
		extent.flush();
		
	}
	public static String screenshot()throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentdir=System.getProperty("user.dir");
		String des=currentdir+"/screenshot/pic.png";
		FileUtils.copyFile(src,new File(des));
		return des;
		
	}

}
