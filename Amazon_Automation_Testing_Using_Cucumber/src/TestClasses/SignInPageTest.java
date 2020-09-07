package TestClasses;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Utils.Configure;
import Utils.InputDataUtils;

public class SignInPageTest {
	static WebDriver driver = null;
	static InputDataUtils inputData = null;
	
	@BeforeClass
	public static void inital() {
	 driver = Configure.getdriver();
	 inputData = Configure.getInputData();
	}
	
	@Test
	public void testSignIn() {
		assertEquals(driver.getTitle(),inputData.getSignInTitle());
	}
	@Test
	public void testUserNameFieldEnabled(){
		assertTrue(page.SignInPage.userName(driver).isEnabled());
	}
	@Test
	public void testEnterUserNameAndClickContinue() throws InterruptedException{
		page.SignInPage.enterUserName(driver, inputData.getUserName());
		page.SignInPage.clickOnContinue(driver);
		assertEquals(driver.getTitle(),inputData.getSignInTitle());
	}
	
	@AfterClass
	public static void last(){
		System.out.println("Closing the Amazon Testing");
//		driver.close();
	}
}
