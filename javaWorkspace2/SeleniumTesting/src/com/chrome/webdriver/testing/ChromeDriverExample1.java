package com.chrome.webdriver.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverExample1 
{
       static void validation()
       {
    	    // set property
    	   
    	  // String driverName = "webdriver.chrome.driver";
    	  // String driverPath = "E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromedriver.exe";
    	   
    	   System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromedriver.exe");
    	   System.out.println("Path set..");
    	   
    	   WebDriver obj = new ChromeDriver();
    	   
    	   obj.get("https://www.javatpoint.com/java-tutorial");
    	   System.out.println("open chrome browser...");

           obj.close();
           System.out.println("browser closed...");
       }
       public static void main(String[] args) {
		ChromeDriverExample1.validation();
	}
}
