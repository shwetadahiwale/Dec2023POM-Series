package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//1.private By locators
	private By emailId = By.id("input-email");
	private By passWord = By.id("input-password");
	private By loginButton = By.xpath("//input[@value ='Login']");
	private By forgotPWDLink = By.linkText("Forgotten Password");
	
	//2.public page class constructor
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	//public page actions
	public String getLoginPageTitle() {
		String title = driver.getTitle();
		System.out.println("login page title :" + title);
		return title;
	}
	
	public String getLoginPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("login page title :" +url);
		return url;
	}
	
	public boolean isforgotPwdLinkExist() {
		return driver.findElement(forgotPWDLink).isDisplayed();
	}
	public String doLogin(String username,String pwd) {
		System.out.println("user cred" + username + ":" + pwd);
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(passWord).sendKeys(pwd);
		driver.findElement(loginButton).click();
		return driver.getTitle();
	}
	
	

}
