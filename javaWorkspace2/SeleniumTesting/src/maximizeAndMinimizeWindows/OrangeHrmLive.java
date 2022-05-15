package maximizeAndMinimizeWindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLive 
{
     public static void main(String[] args) throws InterruptedException
     {
		String str="E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",str);
	    WebDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    //Maximize browser windows
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    //Set windows size based on requirement
	    driver.manage().window().setSize(new Dimension(500,700));
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    //Implicit wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    //Enter Required Url and Get Title PageName
	    System.out.println("Geting CurrentUrl="+driver.getCurrentUrl());
	    //Get title page
	    System.out.println("Getting title page="+driver.getTitle().length());
	    //browser close
	    driver.close();
     }
}
