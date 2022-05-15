package navigateCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLive 
{
    public static void main(String[] args) throws InterruptedException 
    {
		String str="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", str);
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(3000);
		//Maximize windows
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//set the windows size as per requiredment
		driver.manage().window().setSize(new Dimension(800,1000));
		//Thread.sleep(3000);
		//maximize windows
		driver.manage().window().maximize();
		// Implicit wait
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Identfying currentUrl and Tilte page
		System.out.println("Get Title page Name and there Length:"+driver.getTitle().length());
		String currentUrl=driver.getCurrentUrl();
		System.out.println("CurrentUrl of Page is="+currentUrl);
		String expectedUrl="https://opensource-demo.orangehrmlive.com/";
		System.out.println("ExpectedUrl of page is= "+expectedUrl);
		//Verifying CurrentUrl and ExpectedUrl ByUseing If_else condition
		if(currentUrl.equals(expectedUrl))
		{
			System.out.println("CuurentUrl verification is passed");
		}
		else
		{
			System.out.println("CuurentUrl verification is Failed");
		}
		//Identifying UserName and PassWord 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		//Navigate browser
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		//Thread.sleep(3000);
		//Identifying UserName and PassWord 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(10000);
		//Identifying LogoutButton and logout browser useing click ()
		driver.findElement(By.linkText("Welcome testing@123")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		//Navigate another page Byuseing navigate ()
		driver.navigate().to("https://www.amazon.in/");
		
		//Thread.sleep(6000);
		//driver.close();
		
		
		
		
	}
}
