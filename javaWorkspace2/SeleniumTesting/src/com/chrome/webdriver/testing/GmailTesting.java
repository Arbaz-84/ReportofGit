package com.chrome.webdriver.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTesting {

	void validation()
	{
        System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromeodriver.exe");
		
		//step 2:
		WebDriver obj = new ChromeDriver();
		
		// step 3: open broswer with gmail url
		obj.get("https://mail.google.com/mail/u/0/");
		System.out.println("url gets open..");
		
		
	}
}
