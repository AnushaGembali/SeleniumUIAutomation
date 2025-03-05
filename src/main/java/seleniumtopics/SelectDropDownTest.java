package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By countryDropDown = By.id("Form_getForm_Country");
		
		System.out.println(eleUtil.doGetDropDownOptionsCount(countryDropDown));
		eleUtil.doPrintDropDownOptionsText(countryDropDown);
		
	}

}