package seleniumtopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String args[]) {
		
		//Create driver instance of the browser on which we want to run the application 
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
		
//		driver.get("www.google.com");  it will not work as protocol is important
		driver.get("https://google.com"); 	//This will work as it is missing WWW which is domain and domain is not important
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		driver.close();
		
	}

}