package com.gecko.webdriver.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class GeckoTesting {
	static void validation()
	{
		//step 1: path set
		System.setProperty("webdriver.gecko.driver", "E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\geckodriver.exe");
		
		//step 2:
		WebDriver obj = new FirefoxDriver();
		
		// step 3: open broswer with gmail url
		obj.get("https://mail.google.com/mail/u/0/");
		System.out.println("url gets open..");
		
		// step 4: close broser
		obj.close();
		System.out.println("broser close..");
		
	}
	public static void main(String[] args) {
		GeckoTesting.validation();
	}

}
