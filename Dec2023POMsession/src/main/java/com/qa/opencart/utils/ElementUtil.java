package com.qa.opencart.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {


	
	private WebDriver driver; //encapsulation private driver 
	
	public ElementUtil(WebDriver driver) // accesed by public constructor or methods
	//constructor can be use set the values also
	{
		this.driver = driver;
	}
	
	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch(locatorType.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorValue); //id is static method need to call with class name
			break;
		case "name":
			locator = By.id(locatorValue); //id is static method need to call with class name
			break;
		case "classname":
			locator = By.id(locatorValue); //id is static method need to call with class name
			break;
		case "xpath":
			locator = By.id(locatorValue); //id is static method need to call with class name
			break;
		case "linktext":
			locator = By.id(locatorValue); //id is static method need to call with class name
			break;
			
			default:
				break;
	}
		return locator;
	}
	public WebElement getElement(String locatorType, String locatorValue) { // methods
		return driver.findElement(getBy(locatorType,locatorValue));
	}
	
	public WebElement getElement(By locator) { // methods
		
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not present");
			e.printStackTrace();
			return null;
		}
		return element;
	}
	
	public void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void dosendKeys(String locatorType,String locatorvalue, String value) {
		getElement(locatorType,locatorvalue).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String dogetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	
	
	public  String doElementGetAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	public  boolean isElementDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	public  boolean isElementExist(By locator) {
		if(getElements(locator).size()==1)
		{
			return true;
		}
		return false;
	}
	
	public  boolean multipleElementExist(By locator) {
		if(getElements(locator).size() >0)
		{
			return true;
		}
		return false;
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public  int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	public ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();// pc=0

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}

		return eleTextList;
	}
	public ArrayList<String> getElementAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttrList = new ArrayList<String>();// pc=0

		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			if (attrValue.length() != 0) {
				eleAttrList.add(attrValue);
			}
		}

		return eleAttrList;

	}
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	
	public String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (Exception e) {
			System.out.println("title is not found within : " + timeOut);
		}
		return null;

	}

	public String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (Exception e) {
			System.out.println("title is not found within : " + timeOut);
		}
		return null;

	}

	public String waitForURLContains(String urlFraction,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch (Exception e) {
			System.out.println("url fraction is not found within : " + timeOut);
		}
		return null;

	}

	public String waitForURLIs(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.urlToBe(url))) {
				return driver.getCurrentUrl();
			}
		} catch (Exception e) {
			System.out.println("url is not found within : " + timeOut);
		}
		return null;

	}
	
	




}
