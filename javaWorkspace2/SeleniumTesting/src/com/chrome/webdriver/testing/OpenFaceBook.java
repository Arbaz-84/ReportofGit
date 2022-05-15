package com.chrome.webdriver.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFaceBook {
	//https://www.facebook.com
	 public static void demo()
	 {
		// Step 1:  Absolute Path....
	//	String driver1="E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
		System.out.println(" Open Chrome Browser");
		
		driver.close();
		System.out.println("Browser Close");
	}
		public static void main(String[] args) {
			OpenFaceBook.demo();
		}
	
}
