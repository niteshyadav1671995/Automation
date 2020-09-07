package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configure {
	static WebDriver driver = null;
	static InputDataUtils inputData = null;
	public static void ConfigureDriver(){
		System.setProperty("webdriver.chrome.driver", "F:\\Jars\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	public static WebDriver getdriver(){
		if (driver == null){
			ConfigureDriver();
		}
		return driver;
	}
	public static InputDataUtils getInputData(){
		inputData = new InputDataUtils();
		return inputData;
	}
	
}
