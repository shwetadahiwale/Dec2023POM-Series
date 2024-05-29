package testngpractice;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	//before annotations:
	@BeforeSuite
	public void dbConnection() {
		System.out.println("DB connection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT--Create user");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		
		System.out.println("BC --launch Browser");
	}
	@BeforeMethod
	public void login()
	{
		
		System.out.println("BC --login to app");
	}
	
	@Test
	public void titleTest() {
		System.out.println("title test");
	}
	@Test
	public void headerTest() {
		System.out.println("headerTest test");
	}
	@Test
	public void urlTest() {
		System.out.println("headerTest test");
	}
	
	//after annotation
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	@AfterMethod
	public void deleteUser() {
		System.out.println("deleteUser");
	}
	@AfterMethod
	public void disconnectwithDB() {
		System.out.println("disconnectwithDB");
	}
	
	

}
