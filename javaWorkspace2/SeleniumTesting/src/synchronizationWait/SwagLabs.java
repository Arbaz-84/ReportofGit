package synchronizationWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabs 
{
      public static void main(String[] args) 
    {
		String str="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",str);
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.saucedemo.com/");
		 System.out.println("After login page title:"+driver.getTitle());
		 //Identifying userName and use sendkeys()
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 //Identfying password and use sendkeys()
		 driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 
		 //Identfying loginButton and use click()
		 driver.findElement(By.name("login-button")).click();
		 
		//Identfying menubar and use click ()
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 
		 WebElement logoutButton=driver.findElement(By.id("logout_sidebar_link"));
		 logoutButton.click();
		 //Explicit wait
		 WebDriverWait wait=new WebDriverWait(driver,20);
		// wait.until(ExpectedCondition.elementToBeClickable(logoutButton));
		 System.out.println("After login page title: "+driver.getTitle());
		 
		 
		 
	}
}
