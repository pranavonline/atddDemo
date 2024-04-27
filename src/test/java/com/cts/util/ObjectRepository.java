package com.cts.util;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ObjectRepository extends Logging {
	File fileGlobalOR = null;
	HashMap<String, String> ORMap = new HashMap<String, String>();

	public ObjectRepository() {
		this.logger = LoggerFactory.getLogger(ObjectRepository.class);
		this.createORMap();
	}

	public WebElement getObject(WebDriver wDriver, String strLogicalName) {
		WebElement element = null;
		char charLocator = '0';
		try {
			logger.debug("Entering getObject ");
			if (this.ORMap != null && (!strLogicalName.equals(""))) {
				String[] arrLocator = strLogicalName.split("_");
			//	charLocator = (char) arrLocator[0].charAt(0);
				if (this.ORMap.containsKey(strLogicalName)) {
					switch (arrLocator[0]) {
					case "Id":
						element = wDriver.findElement(By.id(this.ORMap
								.get(strLogicalName)));
						break;
					case "Name":
						element = wDriver
								.findElement(By.name(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "TagName":
						element = wDriver.findElement(By
								.tagName(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "LinkText":
						element = wDriver.findElement(By
								.linkText(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "PartialLinkText":
						element = wDriver.findElement(By
								.partialLinkText(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "Xpath":
						element = wDriver.findElement(By.xpath(this.ORMap
								.get(strLogicalName)));
						break;
					case "Css":
						element = wDriver.findElement(By
								.cssSelector(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "ClassName":
						element = wDriver.findElement(By
								.className(((String) this.ORMap
										.get(strLogicalName))));
						break;
						
					default:
						logger.debug("Unidentified locator used-Available locators Id,Name,LinkText,PartialLinkText,Css,ClassName and Xpath ");
					}
				}
			}
			logger.debug("Exiting getObject ");
		} catch (Exception e) {
			logger.error("Exception caught in getObject ");
			element = null;
			e.printStackTrace();
		}
		return element;
	}

	public List<WebElement> getObjects(WebDriver wDriver, String strLogicalName) {
		List<WebElement> elements = null;
		char charLocator = '0';
		try {
			logger.debug("Entering getObjects ");
			if (this.ORMap != null && (!strLogicalName.equals(""))) {
				String[] arrLocator = strLogicalName.split("_");
				if (this.ORMap.containsKey(strLogicalName)) {
					switch (arrLocator[0]) {
					case "Id":
						elements = wDriver.findElements(By
								.id(((String) this.ORMap.get(strLogicalName))));
						break;
					case "Name":
						elements = wDriver
								.findElements(By.name(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "TagName":
						elements = wDriver.findElements(By
								.tagName(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "LinkText":
						elements = wDriver.findElements(By
								.linkText(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "PartialLinkText":
						elements = wDriver.findElements(By
								.partialLinkText(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "Xpath":
						elements = wDriver
								.findElements(By.xpath(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "Css":
						elements = wDriver.findElements(By
								.cssSelector(((String) this.ORMap
										.get(strLogicalName))));
						break;
					case "ClassName":
						elements = wDriver.findElements(By
								.className(((String) this.ORMap
										.get(strLogicalName))));
						break;
						
					default:
						logger.debug("Unidentified locator used-Available locators Id,Name,LinkText,PartialLinkText,Css,ClassName and Xpath ");
					}
				}
			}
			logger.debug("Exiting getObjects ");
		} catch (Exception e) {
			logger.error("Exception caught in getObject ");
			elements = null;
			e.printStackTrace();
		}
		return elements;
	}
	public void createORMap() {
		try {
			logger.debug("Entering createORMap ");
			ORMap = new HashMap<String, String>();
		      Properties properties = new Properties();
		      URL strFilePath = ObjectRepository.class.getClassLoader()
						.getResource("OR.properties");
		      fileGlobalOR = new File(strFilePath.toURI());
		      properties.load(new FileInputStream(fileGlobalOR));
		      for (String key : properties.stringPropertyNames()) {                        
		    	  ORMap.put(key, properties.getProperty(key));
		       }
			logger.debug("Exiting createORMap ");
		} catch (Exception e) {
			logger.error("Exception caught in createORMap ");
			e.printStackTrace();
		}

	} 
		
	public HashMap<String, String> getORMap() {
		logger.info("Getting OR Map ");
		return this.ORMap;
	}

	public void setORMap(HashMap<String, String> dataSet) {
		logger.info("Setting OR mapping object to given Map ");
		this.ORMap = dataSet;
	}

	public WebElement CreateObject(WebDriver webDriver, String strLogicName) {
		logger.debug("Entering CreateObject ");
		WebElement element = null, tempElement = null;
		WebDriverWait wdWait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
		tempElement = this.getObject(webDriver, strLogicName);
		element = wdWait.until(ExpectedConditions
				.elementToBeClickable(tempElement));
		logger.debug("Exiting CreateObject ");
		return element;
	}
}
