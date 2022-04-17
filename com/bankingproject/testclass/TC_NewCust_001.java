package com.bankingproject.testclass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.bankingproject.pageobjectclass.BaseClass1;
import com.bankingproject.pageobjectclass.BaseClass2;
import com.bankingproject.pageobjectclass.NewCust;


public class TC_NewCust_001 extends BaseClass2{
	@Test
	public void addcust() {
		driver.get(aURL);
		
		
		NewCust n=new NewCust(driver);
		n.setcname(cname);
		n.setGender();
		n.setdob(dob);
		n.setaddr(addr);
		n.setcity(city);
		n.setstate(state);
		n.setpno(pin);
		n.settno(tno);
		n.setemailid(email);
				
		n.addbtn();
		System.out.println("2222222");
		
		
	}

}
