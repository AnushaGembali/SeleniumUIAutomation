package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingWithoutSelect {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By countryDropDownoptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		System.out.println(eleUtil.doGetElementsListCount(countryDropDownoptions));
		eleUtil.doPrintElementsText(countryDropDownoptions);
		
		
	}

}