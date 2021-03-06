package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin {
	
	public static void main(String[] args) {
		// Absolute path set
		
		// Useing System.SetProperty***
		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe");
		// Instance object create*****
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		// Geting Title Page*******
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Login";
		int getTitleLength = driver.getTitle().length();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened Successfully*******");
		} else {
			System.out.println("Login page Not opened and Title page Failed***");
		}
		// Identify the required element from webpage***
		WebElement userNameInputFiled = driver.findElement(By.id("username"));
		// Perform action the identified element***
		userNameInputFiled.sendKeys("admin234567");

		// remove existing text from the input field***
		userNameInputFiled.clear();
		userNameInputFiled.sendKeys("admin");

		
		
		// identify the password form webpage
		WebElement passwordInputFiled = driver.findElement(By.name("pwd"));
		// perform action the identified element***
		passwordInputFiled.sendKeys("manager");
	

		// identify the loginbutton for webpage***
		WebElement loginbuttonInputFiled = driver.findElement(By.id("loginButton"));
		
		// perform action on loginbutton and identified element***
				loginbuttonInputFiled.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));	
		
		

		// close browser***
		driver.close();

	}
}
