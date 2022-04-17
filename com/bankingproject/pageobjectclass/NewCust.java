package com.bankingproject.pageobjectclass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCust{
	WebDriver d;
	@FindBy(name = "name")
	WebElement cname;
	
	@FindBy(name = "dob")
	WebElement dob;
	@FindBy(name = "addr")
	WebElement addr;
	@FindBy(name = "city")
	WebElement city;
	@FindBy(name = "state")
	WebElement state;
	@FindBy(name = "pinno")
	WebElement pinno;
	@FindBy(name = "telephoneno")
	WebElement telephoneno;
	@FindBy(name = "emailid")
	WebElement emailid;
	
	
	@FindBy(name = "sub")
	WebElement sub;
	public NewCust(WebDriver d1) {
		d=d1;
		PageFactory.initElements(d1, this);
	}
	public void setcname(String name)
	{
		cname.sendKeys(name);
	}
	public void setdob(String dob1)
	{
		dob.sendKeys(dob1);
	}
	public void setaddr(String add)
	{
		addr.sendKeys(add);
	}
	public void setcity(String cityn) 
	{
		city.sendKeys(cityn);
	}
	public void setstate(String state1) 
	{
		state.sendKeys(state1);
	}

	public void setpno(String pno) 
	{
		pinno.sendKeys(pno);
	}

	public void settno(String tno) 
	{
		telephoneno.sendKeys(tno);
	}

	public void setemailid(String email) 
	{
		emailid.sendKeys(email);
	}
 public void setGender() {
	 WebElement gender=d.findElement(By.xpath("(//input[@name='rad1'])[2]"));
	 gender.click();
	
}
	

	public void addbtn()
	{
		sub.click();
	}


}
