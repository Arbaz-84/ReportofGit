package CssAtrributesValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwagLabs {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setup("chrome","https://www.saucedemo.com");
		
		WebElement signInButton=driver.findElement(By.cssSelector("button[type='submit']"));
		String fontSize= signInButton.getCssValue("font-size");
		String fontColor=signInButton.getCssValue("color");
		String fontBackgroundColor=signInButton.getCssValue("background-image");
		
		System.out.println("Font Size: "+fontSize);
		System.out.println("Font Color: "+fontColor);
		System.out.println("FonBack GroundColor: "+fontBackgroundColor);
		
		//String forgotPassWordLinkColor=driver.findElement(By.cssSelector(".forgotPassWordLink")).getCssValue("color");
		//System.out.println("forgotPasswordlink color: "+forgotPassWordLinkColor);
	}

}
