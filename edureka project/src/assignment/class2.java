package assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class2 {
	public static void main(String[] args) {
	//FirefoxDriver driver;
		
		
		
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\libs\\chromedriver.exe");

		driver = new ChromeDriver();
		
 

	//	System.setProperty("webdriver.gecko.driver",C:\\Users\\payal\\libs\\geckodriver-v0.23.0-win64\\geckodriver.exe");

		//driver = new FirefoxDriver();
 

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.edureka.co/");
	//driver.findElement(By.className("trackButton")).sendKeys("Search for a Course");
		
		//driver.findElement(By.id("homeSearchBar")).sendKeys("Search for a Course");
		driver.findElement(By.xpath("//input[@id='homeSearchBar']")).getText();
		//driver.findElement(By.cssSelector("#homeSearchBar")).sendKeys("Search for a Course");
		//driver.findElement(By.name("user_v1[query]")).sendKeys("Search for a Course");
		driver.findElement(By.id("homeSearchBarIcon")).click();
		//driver.findElement(By.className("close close_exit_popup")).click();
	driver.findElement(By.linkText("Log In")).getText();
		driver.findElement(By.linkText("Corporate Training")).getText();
		driver.findElement(By.linkText("Courses")).getText();
	}
		
	
	
	
		
		
	
}

	


	

	


