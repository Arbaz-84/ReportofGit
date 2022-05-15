package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger 
{
     public static void main(String[] args)
     {
		//Absolute path
    	 String path="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
	    //Useing System.setProperty for set driver path
    	 System.setProperty("webdriver.chrome.driver",path);
    	 //Create Instance 
    	 WebDriver object=new ChromeDriver();
    	 //Useing get() get browser page
    	 object.get("https://demo.vtiger.com/vtigercrm/index.php");
    	//Identifying UserName and use sendKeys ()
    	 WebElement userName=object.findElement(By.id("username"));
    	 userName.sendKeys("admin");
    	 //Identfying password and use sendKeys()
    	 WebElement passWord=object.findElement(By.name("password"));
    	 passWord.sendKeys("password");
    	 WebElement loginButton=object.findElement(By.className("password"));
    	 loginButton.sendKeys("Test@123");

    	 
    	
    	
    	 
    	 
     }
}
