package com.chrome.webdriver.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	public static void main(String[] args) {
		//set driver Absolute path By  using System.getProperty***
		System.getProperty("webdriver.chrome.driver","/SeleniumTesting/executables/chromedriver.exe");
		
		//Create Instance of chrome browser
		WebDriver driver= new ChromeDriver();
		
		//get URL By using driver.get();
		driver.get("https://www.actitime.com/demo-request");
		
		String expectedTitle="actiTime-Login";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Login Successfully...");
		}
		else
		{
			System.out.println("Url Is Wrong so Login Failed....");
		}
		// Identify the required element from the UI WebElement...
		WebElement userNameInputFiled = driver.findElement(By.id("username"));
		
		userNameInputFiled.sendKeys("admin234567");
		userNameInputFiled.clear();
		userNameInputFiled.sendKeys("admin");
		
		WebElement passwordInputFiled = driver.findElement(By.name("pwd"));
		passwordInputFiled.sendKeys("manager");
		
		List<WebElement> loginButton = driver.findElements(By.id("loginButton"));
		((WebElement) loginButton).click();
		
	}

}
