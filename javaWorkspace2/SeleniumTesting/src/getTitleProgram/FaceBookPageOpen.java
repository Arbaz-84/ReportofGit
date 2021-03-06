package getTitleProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBookPageOpen
{
public static void main(String[] args) 
{
	//Absolute path
	String driverpath="E:\\Acceleration\\Automation testing\\Selenium Program\\msedgedriver.exe";
	//set property path
	System.setProperty("webdriver.edge.driver", driverpath);
	//instance create
	WebDriver object=new EdgeDriver ();
	object.get("https://www.facebook.com/login.php?msclkid=82bd4b42c60011ec836b2d9f37bb1b88");
	
	//get the enter URL form the opened browser
	String appCurrentUrl=object.getCurrentUrl();
	System.out.println("***************Program Start**********");
	System.out.println("AppCurrentUrl:"+appCurrentUrl);
	String expectedUrl="https://www.facebook.com/login.php?msclkid=82bd4b42c60011ec836b2d9f37bb1b88";
	System.out.println("Expected Url:"+expectedUrl);
	//verify the appcurrent Url and expected Url By useing If_else condition
	//if(appCurrentUrl.contains(expectedUrl))
	if(appCurrentUrl.equals(expectedUrl))
	{
		System.out.println("Current Url is verification passed");
	}
	else
	{
		System.out.println("Current Url is veification Failed");
	}
	
	//get the Title page and Verify useing If_else Condition
	String actualTitle=object.getTitle();
	int actualTilteLength=object.getTitle().length();
	System.out.println("ActualTile Name:"+actualTitle);
	String expectedTitle="FaceBook";
	System.out.println("ExpectedTitle Name:"+expectedTitle);
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("ActualTitle Name is ok");
	}
	else
	{
		System.out.println("ExpectedTitle Name is Failed");
	}
	System.out.println("***************Program Ends**********");
	//object.close();
}
}
