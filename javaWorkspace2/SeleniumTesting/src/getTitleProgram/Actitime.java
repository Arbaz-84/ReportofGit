package getTitleProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime 
{
	public static void main(String[] args) 
	{
		//Absolute path
		String str="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
		//Use setPropertey ()
		System.setProperty("webdriver.chrome.driver",str);
		//create Instance
		WebDriver driver=new ChromeDriver();
		
		//Get Page Title and title length
		driver.get("https://demo.actitime.com/login.do");
		String actualTitlePage=driver.getTitle();
		int actualTitlePageLength=driver.getTitle().length();
		System.out.println("Actual Title Page is:"+actualTitlePage);
		System.out.println("Tilte Page Length:"+actualTitlePageLength);
		String expectedTitlePage="actiTIME - Login";
		System.out.println("Expected Title Page is:"+expectedTitlePage);
		//Useing if_else condition for verifying the actual and expected title name
		if(actualTitlePage.contains(expectedTitlePage))
		{
			System.out.println("Actaul Title Page Verification is passed***");
		}
		else
		{
			System.out.println("Actaul Title Page Verification is failed***");
		}
		//Get page Url and compare with expected url 
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Browser Current Url is:"+currentUrl);
		String expectedUrl="https://demo.actitime.com/login.do";
		System.out.println("Expected Url is:"+expectedUrl);
		//Useing If_else Condition for verification CurrentUrl and ExpectedUrl
		if(currentUrl.equals(expectedUrl))
		{
			System.out.println("CurrentUrl Verification is Passed");
		}
		else
		{
			System.out.println("CurrentUrl Verification is Failed");
		}
	    //Get page webpage Source content
		String pageSourceContent=driver.getPageSource();
		System.out.println("Source Content:"+pageSourceContent.length());
	}

}
