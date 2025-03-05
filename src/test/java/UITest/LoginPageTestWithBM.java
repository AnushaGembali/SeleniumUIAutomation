package UITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginPageTestWithBM extends BaseTest{
	
	@Test(priority = 1)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("The login page title is: " + title);
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test(priority = 2)
	public void pageURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("The login page url is: " + url);
		Assert.assertTrue(url.contains("route=account/login"));
	}

}
