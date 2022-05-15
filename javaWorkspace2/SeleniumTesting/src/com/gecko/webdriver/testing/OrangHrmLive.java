package com.gecko.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangHrmLive {
	public static void main(String[] args) {
		//Absolute path***
		String path="E:\\Acceleration\\Automation testing\\Selenium Driver\\geckodriver.exe";
		//Useing System.setProperty
		System.setProperty("webdriver.gecko.driver",path);
		//create instance****
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Get titlepage and verifying expectedTitlepage
		String actualTitle=driver.getTitle();
		System.out.println("AtualTitle Page name:"+actualTitle);
		String expectedTitle="OrangeHRM";
		System.out.println("ExpectedTitle Page Name: "+expectedTitle);
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("ActualTitle Verification is Passed");
		}
		else
		{
			System.out.println("ActualTitle Verification is Failed");
		}
		//Identifying Username and useing SendKeys 
		WebElement userName=driver.findElement(By.id("txtUsername"));
		//Useing sendKey 
		userName.sendKeys("Admin");
		//Identifying Password and useing sendkeys
		WebElement password=driver.findElement(By.name("txtPassword"));
		//Useing sendkeys
		password.sendKeys(" admin123");
		//Identifying LoginButton and Useing click ()
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		//close browser
		driver.close();
		
	}

}
