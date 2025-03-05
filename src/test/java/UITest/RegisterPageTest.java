package UITest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class RegisterPageTest extends BaseTest{
	
	@Test
	public void registerUser() {
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("Anusha");
		driver.findElement(By.id("input-lastname")).sendKeys("Bellala Gembali");
		driver.findElement(By.id("input-email")).sendKeys("BellalaGembali@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1111111111");
		driver.findElement(By.id("input-password")).sendKeys("nhujj");
		driver.findElement(By.id("input-confirm")).sendKeys("nhujj");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		String actualText = driver.findElement(By.tagName("h1")).getText();
		String expText = "Your Account Has Been Created!";
		Assert.assertEquals(actualText, expText);
	}

}
