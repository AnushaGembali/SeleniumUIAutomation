package UITest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestNGDataProvider extends BaseTest{
	
	
	@Test(dataProvider = "getSearchData")
	public void searchItems(String searchKey, String searchValue) {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(searchKey);
		driver.findElement(By.cssSelector(".btn-default")).click();
		driver.findElement(By.linkText(searchValue)).click();
		String actualText = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(actualText, searchValue);
	}
	
	@DataProvider
	public Object[][] getSearchData(){
		return new Object[][] {
			{"macbook", "MacBook Pro"},
			{"samsung", "Samsung SyncMaster 941BW"},
			{"imac", "iMac"}
		};
	}
	

}
