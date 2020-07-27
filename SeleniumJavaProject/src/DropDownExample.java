import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
 public static void main(String args[]){
	 System.setProperty("webdriver.chrome.driver", "F:\\Jars\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
//  Enter you file location here, or download it from this link: 
	 driver.get("F:\\practice\\DropDown.html");
	 WebElement countryElement = driver.findElement(By.id("country"));
	 Select countryDropDown = new Select(countryElement);
// For selecting an option by it's text displayed in the drop-down 
//	 countryDropDown.selectByVisibleText("Japan");
	 
// For selecting an option by it's index, indexing start from 0 and goes on	 
//	 countryDropDown.selectByIndex(2);
	 
// For selecting an option by it's value as mentioned in the "option" tag 
	 countryDropDown.selectByValue("3");
 }
}
