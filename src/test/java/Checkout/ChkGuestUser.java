package Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChkGuestUser {
	
	@Test
	public static void launch(){
		
		//System.setProperty("webdriver.gecko.driver","D:\\Java_Eclipse3\\geckodriver-v0.19.0-win64\\geckodriver.exe");
 //System.setProperty("webdriver.firefox.marionette","D:\\Java_Eclipse3\\geckodriver-v0.19.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
	
	driver.get("https://google.com");
	

}
}