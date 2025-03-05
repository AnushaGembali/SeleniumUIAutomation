package seleniumtopics;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopupHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String userName = "admin";
		String password = "admin";
		
		((HasAuthentication)driver).register(UsernameAndPassword.of(userName, password));
//		((HasAuthentication)driver).register(() -> new UsernameAndPassword(userName, password));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");

		
	}

}