package getTitleProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBrowserOpen
{
	public static void main(String[] args)
{
    //Absolute path
	String path="E:\\Acceleration\\Automation testing\\Selenium Driver\\chromedriver.exe";
	
	// Use set property
	System.setProperty("webdriver.chrome.driver",path);
	
	//instace create
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    
	//get the entered URL from the opened browser
	System.out.println("********Browser Starts********");
	String appCurrentUrl=driver.getCurrentUrl();
	String expectedUrl="https://www.google.com/";
	System.out.println("Atcual URL: "+appCurrentUrl);
	System.out.println("Expected URL: "+expectedUrl);
	if(appCurrentUrl.contains(expectedUrl))
	{
		System.out.println("Current URL vaildation is passed");
	}
	else
	{
		System.out.println("Current URL Validation is Failed");
		
	}
	
	//Verify the google page is open or not useing title
	String actualTitle=driver.getTitle();
	int actualTitlelength=driver.getTitle().length();
	System.out.println("ActualTitle: "+actualTitle);
	System.out.println("ActualTitle Length: "+actualTitlelength);
	String expectedTitle="Google";
	System.out.println("ExpectedTitle:"+expectedTitle);
	//(actualTitle.equals(expectedTitle))
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("Title validation is passed");
	}
	else
	{
		System.out.println("Title validation is failed");
	}
	//get webpage source content
	String sourceContent=driver.getPageSource();
	System.out.println("Source content length:"+sourceContent.length());
	System.out.println("******Browser Ends********");
	driver.close();
}
}
