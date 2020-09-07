package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Configure;
import Utils.InputDataUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTestAmazon {
	WebDriver driver = null;
	InputDataUtils inputData = null;
	
	@Given("^Open the Amazon Websites$")
	public void open_the_amazon_site(){
		driver = Configure.getdriver();
		driver.get("http://www.amazon.com");
	}
	
	@When("^SearchText is entered in the search field$")
	public void search_the_product_on_Amazon(){
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Earbuds"+"\n");
	}
	
	@Then("^Verify that product is displayed$")
	public void verify_that_product_is_displayed(){
		driver.getPageSource().contains("Earbuds");
	}
}
