package com.chrome.webdriver.testing;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenOrangeHrmLive 
{
public static void main(String[] args)
{
	//Absolute path set******
	String path="E:\\Acceleration\\Automation testing\\Selenium Program\\chromedriver.exe";
	
	//Use Set property***
	System.setProperty("webdriver.chrome.driver",path);
	
	//Instance create
	WebDriver object=new ChromeDriver();
	
	//Use get Property and open new website on chrome browser
	object.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("Browser Start******");
	
	object.close();
	System.out.println("Browser Ends********");
}
}
