package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class AccountPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1.private By locators
	private By logoutLink = By.id("input-email");
	private By myAccountLink = By.id("input-password");
	private By headers = By.xpath("//input[@value ='Login']");
	private By searchIocon = By.cssSelector("div#search button");
		
	//2.public page class constructor
	
	public void AccountsPage(WebDriver driver) {
		this.driver= driver;
		eleUtil = new ElementUtil(driver);
		//return title;
	}
	
	public String getAccPageTitle() {
		String title = eleUtil.waitForTitleIs("Account Login", 5);
		System.out.println("login page title :" + title);
		return title;
	}
	
	public String getAccPageURL() {
		String url = eleUtil.waitForURLContains("route=account/login,5");
		System.out.println("login page title :" +url);
		return url;
	}
	public boolean isLogOutLinkExist() {
		return eleUtil.waitFor
	}
	
	

}
