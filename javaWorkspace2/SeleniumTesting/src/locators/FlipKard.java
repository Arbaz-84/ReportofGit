package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKard {
	public static void main(String[] args) {
		//Absolute path***
		String driverPath="E:\\Acceleration\\Automation testing\\Selenium Driver\\chromedriver.exe";
		//Useing System.setProperty
		System.setProperty("webdriver.chrome.driver",driverPath);
		//Create Instance
		WebDriver object=new ChromeDriver();
		object.get("https://www.flipkart.com/");
		//Getting ActualUrl and Verifying Url***
		String currentUrlPage=object.getCurrentUrl();
		System.out.println("CurrentUrlPage: "+currentUrlPage);
		String expectedUrlPage="https://www.flipkart.com/";
		System.out.println("ExpectedUrlPage is: "+expectedUrlPage);
		//Comparision CurrentUrlPage and ExpectedUrlPage ****
		if(currentUrlPage.contains(expectedUrlPage))
		{
			System.out.println("CurrentUrlPage verification is Passed");
			
		}
		else
		{
			System.out.println("CurrentUrlPage verification is Failed");
		}
		//Getting AcctualTitlePage ande verifying expectedTitlePage ****
		String actualTitlePage=object.getTitle();
		System.out.println("ActualTitlePage is :"+actualTitlePage);
		String expectedTitlePage="Flipkart";
		System.out.println("ExpectedTitlePage is :"+expectedTitlePage);
		int actualTitleLength=object.getTitle().length();
		System.out.println("ActualTitlLength: "+actualTitleLength);
		if(actualTitlePage.equals(expectedTitlePage))
		{
			System.out.println("ActualTitlePage verification is passed");
		}
		else
		{
			System.out.println("ActualTitlePage verification is Failed");
		}
		//Identifying UserName and Sending username by SendKey()
		WebElement userName=object.findElement(By.className("xtXmba"));
		WebElement loginButton=object.findElement(By.className("xtXmba"));
		loginButton.click();
		WebElement loginPageRemove=object.findElement(By.className("_2KpZ6l _2doB4z"));
		loginPageRemove.isEnabled();
		
		
		
	}

}
