package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
	public static void main(String[] args) {
		//Absolute path************
		String path="E:\\Acceleration\\Automation testing\\Selenium Driver\\chromedriver.exe";
		//Useing System.setproperty****
		System.setProperty("webdriver.chrome.driver",path);
		//Create Instance*****
		WebDriver driver=new ChromeDriver();
		System.out.println("********SwagLabs Browser Open********");
		//Select which types of browser open and paste click on here***
		driver.get("https://www.saucedemo.com/");
		//Geting Title page and Verify Title****
		String actualTitle=driver.getTitle();
		System.out.println("ActualTitle: "+actualTitle);
		String expectedTitle="Swag Labs";
	    System.out.println("ExpectedTitle: "+expectedTitle);
	    int getTitleLength=driver.getTitle().length();
	    System.out.println("GetTitleLength: "+getTitleLength);
	    //Verifying Title name same as Expected Title name Useing If_else Condition*****
	    if(actualTitle.contains(expectedTitle))
	    {
	    	System.out.println("ActualTitle Verification is Passed***");
	    }
	    else
	    {
	    	System.out.println("AtualTitle Verification is Failed***");
	    }
	    
	    //Identify the UserName and send username on userName box Useing sendKeys***
	    WebElement userNameInput=driver.findElement(By.id("user-name"));
	    userNameInput.sendKeys("standard_user");
	    //Identify the PassWord and send Password on password box useing sendkeys****
	    WebElement passWordInput=driver.findElement(By.name("password"));
	    passWordInput.sendKeys("secret_sauce");
	    //Identify the LoginButton and open browser useing click button****
	    WebElement loginButton=driver.findElement(By.id("login-button"));
	    loginButton.click();
	    System.out.println("********SwagLabs Browser Closed********");
	    
	   // driver.close();
	}

}
