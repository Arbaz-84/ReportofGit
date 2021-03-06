package CssAtrributesValidation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	public static WebDriver driver = null;
	public static Actions action =null;
	
	public WebDriver setup(String browserName,String appUrl) {
		if(browserName.equalsIgnoreCase("Chrome")) {
		//Use Setup method of WebDriverManger
		WebDriverManager.chromedriver().setup();
		//Step2:Create an instance of chrome Browser
		driver =new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")){
		//Use setup method WebDriverManger
			WebDriverManager.iedriver().setup();
			//Step2:create an Instance of chrome Browser
			driver=new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
	    //USe setup method WebDriverManger
			WebDriverManager.firefoxdriver().setup();
			//Step2:create an instance of firefox Browser
			driver=new FirefoxDriver();	
		}
		//Maximize browser
		driver.manage().window().maximize();
		//implicity wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(appUrl);
		action=new Actions(driver);
		return driver;
		}
	public void loadPropertyFile(String path) {
		
	}
	public String getCurrentWorkingDir() {
		String currentDir=System.getProperty("user.dir");
		return currentDir;
	}
	public String getValueFromPropetyFile(String fileName,String key) {
		Properties prop=getPropertyFile(fileName);
		return prop.getProperty(key);
	}
	public Properties getPropertyFile(String fileName) {
		String filePath=getCurrentWorkingDir()+fileName;
		FileInputStream fis=null;
		try {
		fis=new FileInputStream(filePath);
        }catch (FileNotFoundException e) {
        	e.printStackTrace();
        }
		Properties prop=new Properties();
		try {
			prop.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	public void cleanUp() {
		driver.close();
	}
	public void rightClick(WebElement option) {
		action.moveToElement(option).contextClick().build().perform();
		
	}
	public void mouseHoverWithCords(WebElement option,int x, int y) {
		action.moveToElement(option,x, y);	
	}

}
