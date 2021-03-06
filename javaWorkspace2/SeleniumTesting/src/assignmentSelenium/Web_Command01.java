package assignmentSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Command01 {
 public static void main(String[] args) {
	 //Absolute path set****
	 //String path="E:\\Acceleration\\Automation testing\\javaWorkspace\\SeleniumTesting\\executables\\chromedriver.exe";
	//System Property for Chrome Driver****
	 System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation testing\\javaWorkspace2\\SeleniumTesting\\executables\\chromedriver.exe" );
	 
	 //Object of chromeDriver Class****
	 WebDriver driver= new ChromeDriver();
	 
	 String url=("https://www.google.co.in/");
	 
	 driver.get(url);
	 // url is passed in Chrome
	
	 //Storing title name in string variable
	 String title=driver.getTitle();
	 
	 //Storing title length in the int variable
	 int titleLength=driver.getTitle().length();
	 
	 //Printing Title & Title Length in the console windows
	 System.out.println("Title of the page is: "+title);
	 System.out.println("Length of the title is: "+titleLength);
	 
	 //Storing URL in String Variable
	 String actualUrl=driver.getCurrentUrl();
	 
	 System.out.println("Actual URL="+actualUrl);
	 
	 if(actualUrl.equals(url))//*****url1=
	 {
		 System.out.println("Verification Successful-The correct Url is Open.");
	 }
	 else 
	 {
		 System.out.println("Verification Failed-An incorrect Url is Open");
	 }
	
	 //Storing Page source is string variable
	 String pageSource= driver.getPageSource();
	 
	 //Storing page source length in int variable
	 int pageSourceLength= pageSource.length();
	 
	 //Printing length of thee page source on console
	 System.out.println("Total Length of the pageSource is:"+pageSourceLength);
	 
	 driver.close();
	 
	 
	 
	 
}
}
