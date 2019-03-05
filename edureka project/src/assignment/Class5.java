package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class5 {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\libs\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
			driver.get("https://www.edureka.co/");
			//driver.findElement(By.id("modalbanner"));
		//	driver.close();
			String ParentWindow = driver.getWindowHandle();
      driver.findElement(By.linkText("Log In")).click();
           driver.findElement(By.id("si_popup_email")).sendKeys("payalbhatt16@gmail.com");
           
      driver.findElement(By.id("si_popup_passwd")).sendKeys("1234567890");
      driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
      driver.findElement(By.className("webinar-profile-name")).click();
      
      WebElement element = driver.findElement(By.partialLinkText("P"));
     Actions action = new Actions(driver);
     action.moveToElement(element).moveToElement(driver.findElement(By.linkText("My Profile"))).click().build().perform();
	
   driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
   driver.findElement(By.className("profile-edit-icon")).click();
	  
	  driver.findElement(By.name("fullname")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.name("fullname")).sendKeys("Payal Bhatt");
	  Thread.sleep(2000);
	  
 	  
 driver.findElement(By.xpath("//div/button[@type='button']/span[@class='caret']")).click();

Actions action2 = new Actions(driver);
action2.moveToElement(driver.findElement(By.xpath("//div[@class='ps-content']/li[3]"))).click().build().perform();
 	 driver.findElement(By.name("phone_number")).clear();
 	 driver.findElement(By.name("phone_number")).sendKeys("2017441852");
 	 driver.findElement(By.name("currentrole")).clear();
 	 driver.findElement(By.name("currentrole")).sendKeys("Manual Tester");
 	 
       WebElement drop = driver.findElement(By.id("experience"));
        Select experience= new Select(drop);
        
 	  experience.selectByValue("2-4 years");
 	  
 	  Thread.sleep(2000);
 driver.findElement(By.xpath("//form/button[contains(text(),'Continue')]")).click();
 	driver.findElement(By.xpath("//div[@class='otp-varification-tab']/button[contains(text(),'Continue')]")).click(); 
 	
  //driver.findElement(By.xpath("//div[@id='personaldetails']/div/div/div/div/div/button")).click();

 	 	  
 	//driver.findElement(By.className("icon-Arrow-Left")).click();
	

 	    	//  driver.switchTo().frame("contentDiv");
 	    	//  driver.findElement(By.className("CT_InterstitialClose")).click();
 	 
 	 
 	  driver.findElement(By.className("overlay")).click();
 	  
     	 driver.findElement(By.name("companyName")).clear();
     	driver.findElement(By.name("companyName")). sendKeys("CyberThink INC");
     	WebElement job =  driver.findElement(By.name("currentjob"));
     	Select currentjob = new Select (job);
     	currentjob.selectByValue("Entry Level");
     	
     	 WebElement Industry = driver.findElement(By.name("currentIndustry"));
     	 Select currentIndustry = new Select(Industry);
     	 currentIndustry.selectByValue("IT-Software / Software Services");
     	 
     	 driver.findElement(By.name("userSkill")).clear();
     	driver.findElement(By.name("userSkill")).sendKeys("Manual Tester");
     	 driver.findElement(By.xpath("//button[@type='submit']")).click();
     	 Thread.sleep(1000);
     	driver.findElement(By.className("icon-Arrow-Left")).click();
     	Actions action3 = new Actions(driver);
     	action3.moveToElement(driver.findElement(By.linkText("Blog"))).click().build().perform();
     	
    	driver.switchTo().window(ParentWindow);
    	
    	 WebElement element2 = driver.findElement(By.linkText("Payal")) ;
         Actions action4 = new Actions(driver);
         action.moveToElement(element).moveToElement(driver.findElement(By.linkText("Log Out"))).click().build().perform();
      }
}
