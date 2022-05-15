package handlingMultipleElements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBlaze 
{
    public static void main(String[] args) 
    {
	    String str="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",str);
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //Implicit wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.demoblaze.com/");
	    //Useing of ListElement 
	    List<WebElement> categories =driver.findElements(By.cssSelector(".list-group>*"));
	    System.out.println("Option count is ="+categories.size());
	    //Createing expected results of list
	    List<String> expectedCat= new ArrayList<String>();
	    expectedCat.add("CATEGORIES");
	    expectedCat.add("Phones");
	    expectedCat.add("Laptops");
	    expectedCat.add("Monitors");
	  //Logic to get one by one element from the list and performing validation on that
	    for(int i=0;i<categories.size();i++)
	    {
	    	WebElement cat=categories.get(i);
	    	System.out.println("*******Element of list is:"+cat.getText()+"***********");
	    	System.out.println(cat.isDisplayed());
	    	System.out.println(cat.isEnabled());
	    	System.out.println(cat.getText().equals(expectedCat.get(i)));
	    	
	    }
	    //Browser close
	    driver.close();
	    
	} 
    
}
