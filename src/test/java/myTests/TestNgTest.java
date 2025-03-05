package myTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgTest {
	
//	
//	BeforeSuite - Connecting to DB
//	Before Test - launching the browser
//	Before Class - Opening the app
//	
//	Before Method - Creating user
//	Test - Cart Test
//	After Method - deleting user
//	
//	Before Method - Creating user
//	Test - Payment Test
//	After Method - deleting user
//	
//	Before Method - Creating user
//	Test - User login
//	After Method - deleting user
//	
//	After Class - closing the app
//	After Test - closing the browser
//	After Suite - disconnecting to DB
	
	@BeforeSuite
	public void ConnectToDB() {
		System.out.println("BeforeSuite - Connecting to DB");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Before Test - launching the browser");
	}
	
	@BeforeClass
	public void openApplication() {
		System.out.println("Before Class - Opening the app");
	}

	@BeforeMethod
	public void createUser() {
		System.out.println("Before Method - Creating user");
	}

	@Test
	public void userLogin() {
		System.out.println("Test - User login");
	}
	
	@Test
	public void cartTest() {
		System.out.println("Test - Cart Test");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("Test - Payment Test");
	}
	
	@AfterMethod
	public void deleteUser() {
		System.out.println("After Method - deleting user");
	}
	
	@AfterClass
	public void closeApplication() {
		System.out.println("After Class - closing the app");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("After Test - closing the browser");
	}
	
	@AfterSuite
	public void disconnectToDB() {
		System.out.println("After Suite - disconnecting to DB");
	}	

}
