package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class SearchResultsPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	//1.private By locators
	private By searchProduct = By.cssSelector("div.product-thumb");
	
	//2.public page class constructor
	
	public void SearchResult(WebDriver driver) {
		this.driver= driver;
		eleutil = new ElementUtil(driver);
	}
	
	
	//public page actions
	public String getSearchProductCount() {
		return eleutil

}
