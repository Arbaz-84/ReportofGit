package com.chrome.webdriver.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeDriver2 {
	public static void star () 
	{
		
		//Step1:  Absolute path set*********
		//String path1="E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromedriver.exe";
		
		//Step2: 
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromedriver.exe");
		
		
		//Object creation******
		WebDriver obj = new ChromeDriver();
		
		//get.property use and get which website open****
	    obj.get("https://www.google.com/search?q=vegamoves.in&oq=&aqs=chrome.0.35i39i362l8.8071374j0j15&sourceid=chrome&ie=UTF-8");
	    System.out.println("Open Browser*****");
	    
	    obj.close();
	    System.out.println("Browser Close*****");
	    
	}
public static void main(String[] args) {
	ChromeDriver2.star();
}
}
