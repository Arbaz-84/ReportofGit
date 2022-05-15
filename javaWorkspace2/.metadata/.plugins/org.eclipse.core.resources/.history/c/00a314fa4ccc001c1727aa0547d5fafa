package CssAtrributesValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssAtrributesValidation {

	private static String fontColor;
	private static String fontBackgroundColor;

	public static void main(String[] args) {
	SeleniumUtility s1=new SeleniumUtility();
	WebDriver driver=s1.setup("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	
	WebElement signInButton=driver.findElement(By.cssSelector("button[type='submit']"));
	String fontSize=signInButton.getCssValue("font-size");
	String fontColour=signInButton.getCssValue("color");
	String fontBackgroundColour=signInButton.getCssValue("background-image");
	
	System.out.println("Font Size: "+fontSize);
	System.out.println("Font Color: "+fontColor);
	System.out.println("Font Background Color: "+fontBackgroundColor);
	
	String forgotPasswordLinkColor=driver.findElement(By.cssSelector(".forgotPasswordLink")).getCssValue("color");
	System.out.println("forgotPasswordLink Color: "+forgotPasswordLinkColor);

	}

}
