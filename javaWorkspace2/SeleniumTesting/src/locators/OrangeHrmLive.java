package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLive {
private static WebElement passWordInputFiled;
private static WebElement loginButtonInput;

public static void main(String[] args) {
	//Absolute path*****
	String driverPath="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
	//Useing System.setProperty and set property****
	System.setProperty("webdriver.chrome.driver",driverPath);
	//create Instance*****
	WebDriver object=new ChromeDriver();
	object.get("https://opensource-demo.orangehrmlive.com/");
	
	//Getting Title URL****
	//String actualcurentUrl=object.getCurrentUrl();
	//System.out.println("ActualUrl: "+actualcurentUrl);
	//String expectedUrl="https://opensource-demo.orangehrmlive.com/";
	//System.out.println("ExpectedUrl: "+expectedUrl);
	//Verifying actualCurrentUrl and ExpectedUrl By using If_else Condition****
	//if(actualcurentUrl.equals(expectedUrl))
	//{
	//	System.out.println("ActualCurentUrl verification is Passsed*****");
	//}
	//else
	//{
	//	System.out.println("ExpectedUrl verification is Failed");
	//}
	//Getting Title Page*****
	String currentTitle=object.getTitle();
	System.out.println("CurrentTitle Page: "+currentTitle);
	String expectedTitle="OrangeHRM";
	System.out.println("ExpectedTitle Page:"+expectedTitle);
	int actualTitlelength=object.getTitle().length();
	System.out.println("ActualTitle Length: "+actualTitlelength);
	//Verifying actualTitle and expectedTitle by using If_else Condition****
	if(currentTitle.equals(expectedTitle))
	{
		System.out.println("CurrentTitle: "+currentTitle);
	}
	else
	{
		System.out.println("ExpectedTitle: "+expectedTitle);
	}
	//Identify the UserName and Useing sendKeys send the userName***
	WebElement userNameInputFiled=object.findElement(By.id("txtUsername"));
	userNameInputFiled.sendKeys("Admin");
	
    //Verifying the Password and Useing sendkeys send the passWord***
	WebElement passWordInputField=object.findElement(By.name("txtPassword"));
	passWordInputFiled.sendKeys("admin123");
    
	//Verifying the LoginButton and click () use***
	WebElement loginButtonInputFiled=object.findElement(By.id("loginbutton"));
	loginButtonInputFiled.click();
	
	//close browser***
	//object.close();
	System.out.println("Browser Ends******");
	
}
}
