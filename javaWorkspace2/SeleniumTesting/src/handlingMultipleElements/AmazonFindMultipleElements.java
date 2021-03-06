package handlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFindMultipleElements 
{
     public static void main(String[] args) 
    {
		String str="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",str);
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicit wait provided
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//get () used
		driver.get("https://www.amazon.in/");
		//Useing ListElement () to finding list of element in browser
		List<WebElement> categories = driver.findElements(By.cssSelector(".nav-progressive-content>*"));
		System.out.println("List of Categories Print and with size::"+categories.size());
		//Useing For loop for print the categories element line by line
		for(WebElement element:categories)
		{
			System.out.println(element.getText());
		}
		driver.close();
		
	}
}
