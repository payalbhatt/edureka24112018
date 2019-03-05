package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeClass {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\Users\\payal\\libs\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
 
 driver.manage().deleteAllCookies();
 driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
 
 driver.get("https://www.expedia.com/");
 
 driver.findElement(By.className("tab-label")).click();
 
 driver.findElement(By.id("flight-type-one-way-label-hp-flight")).click();
 
 driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("IAD");
 
  driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("MCO");
 
 
 driver.findElement(By.id("flight-departing-single-hp-flight")).sendKeys("01/20/2019");
	
	driver.findElement(By.id("traveler-selector-hp-flight")).click();
	
       driver.findElement(By.xpath("//div[@class='traveler-selector-sinlge-room-data traveler-selector-room-data']/div[@data-control='uitk-step-input']/div[@class='uitk-col all-col-shrink']/button[@type='button']/span[contains(text(),'Add Adult')]")).click();
	
	driver.findElement(By.xpath("//button[@class='close btn-text'][1]")).click();
	driver.findElement(By.xpath("//label[@class='col search-btn-col']/button[@type='submit'][1]")).click();
	}

}
