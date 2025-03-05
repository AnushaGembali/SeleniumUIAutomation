package UITest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("The login page title is: " + title);
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test
	public void pageURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("The login page url is: " + url);
		Assert.assertTrue(url.contains("route=account/login"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
