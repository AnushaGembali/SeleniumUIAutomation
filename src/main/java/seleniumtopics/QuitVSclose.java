package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSclose {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com"); 	
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		Thread.sleep(Duration.ofSeconds(10));
//		driver.quit();	 --- Session ID will be gone and will be null	
//		driver.getTitle(); NoSuchSessionException --- Session Id is null, using web driver after quit() message
		
		driver.close(); //Session will become invalid/expired
//		driver.getTitle(); NoSuchSessionException --- Invalid Session ID
		
	}

}