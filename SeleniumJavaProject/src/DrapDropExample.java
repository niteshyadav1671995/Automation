import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapDropExample {
 public static void main(String args[]) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "F:\\Jars\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://jqueryui.com/droppable/");
	 Thread.sleep(3000);
	 driver.switchTo().frame(0);
	 WebElement draggable = driver.findElement(By.id("draggable"));
	 WebElement droppable = driver.findElement(By.id("droppable"));
	 Actions dragAndDropAction = new Actions(driver);
//  Drag and draggable element and drop it on the droppable element
	 dragAndDropAction.dragAndDrop(draggable,droppable).build().perform();
 }
}
