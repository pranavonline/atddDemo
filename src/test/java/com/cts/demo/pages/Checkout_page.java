package com.cts.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.util.ObjectRepository;

@SuppressWarnings("unused")
public class Checkout_page {
	WebDriver driver;
	
	
   @FindBy(id= "order_name")
	 WebElement orderName;
   
   @FindBy(id= "order_address")
	 WebElement orderAddress;

   @FindBy(id= "order_email")
 	 WebElement orderEmail;
   
   @FindBy(id= "order_pay_type")
	 WebElement payType; 
   
   @FindBy(css= "form input[value='Place Order']")
 	 WebElement placeOrder; 
   
	public Checkout_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public void enter_name(String strName) {
		orderName.sendKeys(strName);
		
	}
	
	public void enter_address(String strAddress) {
		orderAddress.sendKeys(strAddress);
		
	}
	
	public void enter_emailID(String strEmailID) {
		orderEmail.sendKeys(strEmailID);
		
	}
	
	public void select_PayType(String strPayType) {
		Select selOption = new Select(payType);
		List <WebElement> options = selOption.getOptions();
		for (WebElement option : options){
			if (strPayType.equals(option.getText().trim())){
				option.click(); 
			}
			
		}
	}
	
	public Home_page placeOrder() {
		placeOrder.click();
		return new Home_page(driver);
	}
	
}
