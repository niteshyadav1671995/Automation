package TestClasses;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Utils.Configure;
import Utils.InputDataUtils;

public class HomePageTest {
	static WebDriver driver = null;
	static InputDataUtils inputData = null;
	
	@BeforeClass
	public static void inital() {
	 driver = Configure.getdriver();
	 inputData = Configure.getInputData();
	}
	@Test
	public void testSearchField() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(inputData.getBaseURL());
		page.HomePage.searchProduct(driver, inputData.getSearchKeyword());
		Thread.sleep(2000);
		assertTrue(driver.getPageSource().contains(inputData.getSearchKeyword()));
	}
	@Test
	public void testSignIn() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		page.HomePage.clickOnSignIn(driver);
		assertEquals(driver.getTitle(),inputData.getSignInTitle());
	}
}
