package com.cts.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.cts.util.ObjectRepository;

import io.cucumber.java.en.When;

import com.cts.util.ConfigData;

public class Home_page {

	static String Url = "https://magento.softwaretestingboard.com/";
	WebDriver driver;

	ConfigData config = null;
	

	public Home_page(WebDriver driver) {
		config = new ConfigData();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static Home_page loadUsing(WebDriver driver) {
		//driver.manage().window().maximize();
		driver.get(Url);
		return new Home_page(driver);
	}
	
	
	
	

	
	 @FindBy(css ="*[title*='Home Page']") WebElement homelink; 
	 @FindBy(id ="notice") WebElement notice;
	 @FindBy(className ="puppy_list") List<WebElement> colPuppies;
	
	public boolean homeLink(){
		boolean result;
		if (homelink.isDisplayed() & homelink.isEnabled()) {
			result =true; 
		}else {
			result=false;
			}
		return result;
	}
	
	
	public String getNotice(){
		String strResult;
		if (notice.isDisplayed()) {
			strResult =notice.getText() ;
		}else {
			strResult="Not found";
			}
		return strResult;
	}
	public WebElement findPuppy(String puppyToFind){
		 WebElement puppyFound=null;
		for (WebElement puppy: colPuppies ){
			WebElement puppyNames=	puppy.findElement(By.className("name"));
			if (puppyToFind.trim().equals(puppyNames.getText().trim())){
				puppyFound = puppyNames;
				break;
			}
		}
		
		return puppyFound;
	}
	public Details_page selectPuppy(String puppyToFind){
		 WebElement puppyFound=null;
		for (WebElement puppy: colPuppies ){
			WebElement puppyNames=	puppy.findElement(By.className("name"));
			if (puppyToFind.trim().equals(puppyNames.getText().trim())){
				puppyFound = puppy.findElement(By.className("view"));
				break;
			}
		}
		if (puppyFound!=null){
			puppyFound.click();
		}
		return new Details_page(driver);
	}
}
