package com.bankingproject.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class readconfig {
	Properties pro;
	public readconfig() 
	{
		File src=new File("C:\\Users\\Administrator\\eclipse-workspace\\bankingproject\\configuration\\config.properties");
		FileInputStream file;
		
		try {
			pro=new Properties();
			file=new FileInputStream(src);
			pro.load(file);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public String geturl()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getuname()
	{
		String uname=pro.getProperty("username");
		return uname;
	}
	public String getpass()
	{
		String pass=pro.getProperty("password");
		return pass;
	}
	public String addcustURL() {
		String url=pro.getProperty("newcutomerURL");
		return url;
		
	}
	public String cname()
	{
		String name=pro.getProperty("cname");
		return name;
	}
	public String dob()
	{
		String dob=pro.getProperty("dob");
		return dob;
	}
	public String addr()
	{
		String address=pro.getProperty("address");
		return address;
	}
	public String city()
	{
		String city=pro.getProperty("city");
		return city;
	}
	public String state()
	{
		String state=pro.getProperty("state");
		return state;
	}
	public String pin()
	{
		String pin=pro.getProperty("pin");
		return pin;
	}
	public String tno()
	{
		String tno=pro.getProperty("tno");
		return tno;
	}
	public String email()
	{
		String email=pro.getProperty("email");
		return email;
	}

}
