package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
	ChromeDriver driver;
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\chromedriver.exe");
		
  driver = new ChromeDriver();
  driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.facebook.com/");
}
	public void login(String userId,String Password) {
		driver.findElement(By.id("email")).sendKeys(userId);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.id("loginbutton")).click();
	}
}