package com.gecko.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagLabs {
	public static void main(String[] args) {
		
    //Absolute path 
	String driverPath="E:\\Acceleration\\Automation testing\\Selenium Driver\\geckodriver.exe";
	//Useing System.setProperty
	System.setProperty("webdriver.gecko.driver",driverPath);
	//Instance create
	WebDriver object=new FirefoxDriver();
	object.get("https://www.saucedemo.com/");
	
	//Getting TitlePage Name and verification useing sendkeys
	String actualTitleName=object.getTitle();
	System.out.println("ActualTitlePage name: "+actualTitleName);
    String expectedTitleName="Swag Labs";
    System.out.println("ExpectedTitleName: "+expectedTitleName);
    if(actualTitleName.equals(expectedTitleName))
    {
    	System.out.println("ActualTitleName Verification is passed");
    }
    else
    {
    	System.out.println("ActualTitleName Verification is Failed");
    }
	//Identifying the UserName and Useing sendkey for send UserName 
    WebElement userNameInput=object.findElement(By.id("user-name"));
    userNameInput.sendKeys("standard_user");
	WebElement passWordInput=object.findElement(By.name("password"));
	passWordInput.sendKeys("secret_sauce");
	WebElement loginButton=object.findElement(By.id("login-button"));
	loginButton.click();
	
	object.close();
}
}
