package com.cts.demo.stepDefs;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static org.fest.assertions.api.Fail.fail;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;

import com.cts.demo.pages.*;
import com.cts.util.GetBrowser;
import com.cts.util.Logging;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("unused")
public class LumaSteps extends Logging{
	protected WebDriver driver;
	protected Object currentPage;
	protected GetBrowser objBrowser = null;
	protected Home_page onHomePage =null;
	protected Details_page onDetailsPage =null;
	protected Shopping_cart_page  onShoppingCartPage =null;
	protected Checkout_page onCheckoutPage  =null;
	
	public LumaSteps(){
		 this.logger = LoggerFactory.getLogger(LumaSteps.class);
	}
  
  @Before("@requires_browser")
	public void buildDriver() {
		objBrowser =  new GetBrowser();
	}
  
  @Given("^I am on the luma site$")
  public void openLumaSite() {
	  logger.debug("Creating webdriver");
	  this.driver = objBrowser.openBrowser();
	  onHomePage = Home_page.loadUsing(driver);
	  
  }
  
//  When I click "Sign In" link on Home page
  @When("^When I click {string} link on Home page$")
  public void clickElement(String eleName) {
	  logger.info("Placing order to adopt the puppy");
		//onHomePage =Home_page.();
  }

//	@Given("^I am on the puppy adoption site \"(.*?)\"$")
//	public void i_am_on_the_puppy_adoption_site(String BrowserName) throws Throwable {
//		logger.debug("Creating webdriver");
//		this.driver = objBrowser.openBrowser(BrowserName);
//		onHomePage = Home_page.loadUsing(driver);
//		assertTrue(onHomePage.homeLink());
//	}

	@When("^I select \"(.*?)\"$")
	public void i_select(String puppyName) throws Throwable {
		WebElement puppyFound =onHomePage.findPuppy(puppyName);
		assertEquals(puppyFound.getText(),puppyName);
		logger.info("Selecting the puppy");
		onDetailsPage = onHomePage.selectPuppy(puppyName);
	}

	@When("^add the puppy to the shopping cart$")
	public void add_the_puppy_to_the_shopping_cart() throws Throwable {
		logger.info("Adding puppy to cart");
		onShoppingCartPage = onDetailsPage.adoptPuppy();
	}

	@When("^I proceed to the checkout$")
	public void i_proceed_to_the_checkout() throws Throwable {
		logger.info("Proceeding to checkout");
		onCheckoutPage =onShoppingCartPage.proceedToCheckOut();
	}

	@When("^enter \"(.*?)\" in the name field$")
	public void enter_in_the_name_field(String strName) throws Throwable {
		logger.info("Filling the form fields");
		onCheckoutPage.enter_name(strName);
	}

	@When("^enter \"(.*?)\" in the address field$")
	public void enter_in_the_address_field(String strAddress) throws Throwable {
		onCheckoutPage.enter_address(strAddress);
	}

	@When("^enter \"(.*?)\" in the email field$")
	public void enter_in_the_email_field(String strEmailID) throws Throwable {
		onCheckoutPage.enter_emailID(strEmailID);
	}

	@When("^select \"(.*?)\" from the pay type$")
	public void select_from_the_pay_type(String strPayType) throws Throwable {
		onCheckoutPage.select_PayType(strPayType);
	}

	@When("^I click the Place Order button$")
	public void i_click_the_Place_Order_button() throws Throwable {
		logger.info("Placing order to adopt the puppy");
		onHomePage =onCheckoutPage.placeOrder();
	}

	@Then("^I should see \"(.*?)\"$")
	public void i_should_see(String strConfMsg) throws Throwable {
		logger.info("Verifying the confirmation message on home page");
		assertEquals(onHomePage.getNotice(),strConfMsg);
	}
	@Then("^I get a puppy$")
	public void i_get_a_puppy() throws Throwable {
	   System.out.println("I got a puppy");
	} 

	  @After("@requires_browser")
		 public void quit(Scenario scenario) {
		  this.driver.quit();
	 }  
}
