package assignment;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class3 {

	private static final TimeUnit Seconds = null;
	

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,5);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage(). timeouts().pageLoadTimeout(60,TimeUnit.SECONDS); 
		driver.get("https://www.edureka.co/");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.findElement(By.id("homeSearchBar")).sendKeys("Selenium");
		driver.findElement(By.id("homeSearchBarIcon")).click();
	
		
		
	
		WebElement SeleniumCourse = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='textinfoleft']")));
		
		driver.findElement(By.xpath("//div[@class='textinfoleft']")).click();
		 
	String title = driver.getTitle();
String Etitle= "Selenium 3.0 WebDriver Online Training";
	System.out.println(driver.getTitle());
	
		if (title.equals(Etitle));
			
	System.out.println("Pass");
	
	driver.findElement(By.linkText("Home")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.id("dLabel")).click();
	
	
	
	}
	}



