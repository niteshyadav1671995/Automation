package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	public static WebElement element = null;
	

	public static WebElement userName(WebDriver driver){
		element = driver.findElement(By.id("ap_email"));
		return element;
	}
	public static WebElement password(WebDriver driver){
		element = driver.findElement(By.id("ap_password"));
		return element;
	}
	
	public static void enterUserName(WebDriver driver, String username){
		element = driver.findElement(By.id("ap_email"));
		element.sendKeys(username);
	}
	
	public static void enterPassword(WebDriver driver, String password){
		element = driver.findElement(By.id("ap_password"));
		element.sendKeys(password);
	}
	
	public static void clickOnContinue(WebDriver driver){
		driver.findElement(By.id("continue")).click();		
	}
}
