package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_1 
{
	public static void main(String[] args) 
	{
		//Absolute Path set
		String path="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
		//Useing set the driver path byuseing System.SetProperty
		System.setProperty("webdriver.chrome.driver",path);
		//Create Instance
		WebDriver driver=new ChromeDriver();
		//Get Title Page of Browser
		System.out.println("********Program Starts*********");
		driver.get("https://www.saucedemo.com");
		//Get Url and Compare Expected url useing If_else condition
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current Url is="+currentUrl);
		String expectedUrl="https://www.saucedemo.com/";
		System.out.println("Expected Url is="+expectedUrl);
		//Useing If_else condition 
		if(currentUrl.equals(expectedUrl))
		{
			System.out.println("CurrentUrl Verification is passed");
		}
		else
		{
			System.out.println("CurrentUrl Verification is Failed");
		}
		//Get Titlepage, Find Tilte Length and Compare ActualTitle&expectedTitle
		String actualTitlePage=driver.getTitle();
		System.out.println("Actual Title Page is ="+actualTitlePage);
		String expectedTitlePage="Swag Labs";
		System.out.println("Expected Title Page is="+expectedTitlePage);
		int actualTitleLength=driver.getTitle().length();
		System.out.println("ActualTitleLength is="+actualTitleLength);
		//Compare actualTitle and ExpectedTitle Useing If_else condition
		if(actualTitlePage.equals(expectedTitlePage))
		{
			System.out.println("Actual Title page Verification is Passed");
		}
		else
		{
			System.out.println("Actual Title page Verification is Failed");
		}
		//Identifying UserName and Password Useing Locators attributes
		
		WebElement userNameInputFiled=driver.findElement(By.id("user-name"));
		userNameInputFiled.sendKeys("problem_user");
		WebElement passWordInputFiled=driver.findElement(By.name("password"));
		passWordInputFiled.sendKeys("secret_sauce");
		//Identifying LoginButton on webPage
		WebElement loginButtonInputFiled=driver.findElement(By.id("login-button"));
		loginButtonInputFiled.click();
		System.out.println("********Program Ends***********");
		
		
		
	}

}
