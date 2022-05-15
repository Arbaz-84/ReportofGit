package synchronizationWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime 
{
     public static void main(String[] args) 
    {
		String str="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",str);
		WebDriver driver=new ChromeDriver();
		//Implicit wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://demo.actitime.com/login.do");
	    System.out.println("Before login page title:"+driver.getTitle());
	    //Identifying username and use sendkeys ()
	    driver.findElement(By.id("username")).sendKeys("admin");
	    //Identfying password and use sendKeys ()
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    //identfying loginButton and click () use
	    driver.findElement(By.id("loginButton")).click();
	    
	    WebElement logoutBtn=driver.findElement(By.linkText("logout"));
	    
	    //Explicit wait
	    WebDriverWait wait=new WebDriverWait (driver,20);
	    //wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
	    wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
	    System.out.println("After login page Title:"+driver.getTitle());
	    
	    
	    
	    
	}
}
