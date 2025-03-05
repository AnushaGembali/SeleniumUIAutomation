package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initWebDriver("chrome");
		bUtil.launchURl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By mobile = By.id("input-telephone");
		By password = By.id("input-password");
		By cnfrmPswrd = By.id("input-confirm");
		By agreeCheckBox = By.name("agree");
		By continueBtn = By.cssSelector("input.btn.btn-primary");
		
		eleUtil.doSendKeys(firstName, "anusha");
		eleUtil.doSendKeys(lastName, "gembali");
		//eleUtil.doSendKeys(email, "anugembali@gmail.com");
		eleUtil.doSendKeys(mobile, "9846789111");
		eleUtil.doSendKeys(password, "anuTest@123");
		eleUtil.doSendKeys(cnfrmPswrd, "anuTest@123");
		eleUtil.doClick(agreeCheckBox);
		eleUtil.doClick(continueBtn);
		
		Thread.sleep(Duration.ofSeconds(3));
		bUtil.quitBrowser();	
		
	}

}