import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {
 public static void main(String args[]){
	 System.setProperty("webdriver.chrome.driver", "F:\\Jars\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
//  Enter you file location here, or download it from this link: 
	 driver.get("F:\\practice\\WebTable.html");
	 WebElement studentsTable = driver.findElement(By.id("students"));
//  Total number of rows
	 List<WebElement> rows = studentsTable.findElements(By.xpath("//tbody/tr"));
	 System.out.println("Total number of rows: "+rows.size());
//  Total number of columns
	 List<WebElement> columns = studentsTable.findElements(By.xpath("//thead/td"));
	 System.out.println("Total number of columns: "+columns.size());
//  To get the text of the cell
	 String cellText = studentsTable.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
	 System.out.println("Text present under cell at row 2, column 2: "+cellText);
//  List the column headers
	 List<WebElement> columnHeaders = studentsTable.findElements(By.xpath("//thead/tr[1]/td"));
	 System.out.println("Column Header are listed below");
	 for (WebElement column : columnHeaders) {
		System.out.print("\t"+column.getText());
	 }
//  Values displayed in row 1
	 List<WebElement> firtrow = studentsTable.findElements(By.xpath("//tbody/tr[1]/td"));
	 System.out.println("\nValues of row1 are listed below");
	 for (WebElement rowValue : firtrow) {
		System.out.print("\t"+rowValue.getText());
	 }
  }
}
