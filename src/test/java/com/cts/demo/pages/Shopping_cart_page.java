package com.cts.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.util.ObjectRepository;

@SuppressWarnings("unused")
public class Shopping_cart_page {
	WebDriver driver;
	

	 @FindBy(css = "form input[value='Complete the Adoption']")
	 WebElement checkOut;

	public Shopping_cart_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public Checkout_page proceedToCheckOut() {
		checkOut.click();
		return new Checkout_page(driver);
	}
}
