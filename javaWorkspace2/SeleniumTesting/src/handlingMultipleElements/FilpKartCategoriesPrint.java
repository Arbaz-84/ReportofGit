package handlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpKartCategoriesPrint 
{
      public static void main(String[] args)
     {
    	  String str="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
  	    System.setProperty("webdriver.chrome.driver",str);
  	    WebDriver driver=new ChromeDriver();
  	    driver.manage().window().maximize();
  	    //Implicit wait
  	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  	    driver.get("https://www.flipkart.com/");
  	    //Useing of ListElement 
  	    List<WebElement> categories =driver.findElements(By.cssSelector("._37M3Pb>div"));
  	    System.out.println("Option count is ="+categories.size());
  	    for(WebElement element:categories)
  	    {
  	    	System.out.println(element.getText());
  	    }
	 }
}
