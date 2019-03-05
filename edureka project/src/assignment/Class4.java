package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Class4 {
	WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\payal\\libs\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
 
 driver.manage().deleteAllCookies();
 driver.manage().window().maximize();

 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
 
 driver.get("https://www.goindigo.in/?linkNav=home_header");
  driver.findElement(By.id("oneWayTrip")).click();
  
  
  driver.findElement(By.name("or-src")).click();
   driver.findElement(By.name("or-src")).sendKeys("Bengaluru,India");
   Thread.sleep(5000);
   driver.findElement(By.name("or-dest")).click();
   
 driver.findElement(By.name("or-dest")).sendKeys("Lucknow,India");
 Thread.sleep(2000);
 driver.findElement(By.name("or-depart")).click();
 driver.findElement(By.linkText("22")).click();
 
 

 driver.findElement(By.name("passenger")).click();
 driver.findElement(By.xpath("//li[@class='adult-pax-list']/div[@class='no-of-counts']/button[@class='pax-plus btn btn-info']/span[@class='icon-plus']")).click();

  
  driver.findElement(By.xpath("//li[@class='child-pax-list']/div[@class='no-of-counts']/button[@class='pax-plus btn btn-info']/span[@class='icon-plus']")).click();
 
   
   driver.findElement(By.xpath("//div[@class='passenger-done-blck']/button[contains(text(),'Done')]")).click();
   driver.findElement(By.xpath("//button[@type='submit']/span[@class='hp-src-btn']")).click();
   driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	public void printAllFlights() {
		List<WebElement>Flights = driver.findElements(By.xpath("//div[@class='all-direct']/button[@class='selected']"));
 
   for(WebElement list:Flights) {
	System.out.println("Flights:"+list.getText());
	
	
   }	
	
	}
	
	
	
	
		
}

