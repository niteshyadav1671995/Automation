package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	public static WebElement element = null;
	
	public static void searchProduct(WebDriver driver, String searchText){
		element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys(searchText+"\n");
	}
	
	public static void clickOnSignIn(WebDriver driver){
		element = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();		
	}
	
	public static void clickOnLinkTextOnHomePage(WebDriver driver, String linkText){
		driver.findElement(By.linkText(linkText));
	}
}
