package UITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrangeHRMTest extends BaseTest{

	@Test
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("The login page title is: " + title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM");
	}
	
	@Test
	public void pageURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("The login page url is: " + url);
		Assert.assertTrue(url.contains("30-day-free-trial"));
	}
}
