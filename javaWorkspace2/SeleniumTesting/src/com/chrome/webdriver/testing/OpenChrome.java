package com.chrome.webdriver.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
public static void main(String[] args) {
	//Absolute path..
	String driverPath1="E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromedriver.exe";
	//or
	
	String derverPath2=".\\executables\\chromedriver.exe";
	
	//or
	String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", derverPath2);
	//create an instance of required browser class
	WebDriver driver=new ChromeDriver();
	
	driver.close();
	System.out.println("Browser close***");
	
	
}
}
