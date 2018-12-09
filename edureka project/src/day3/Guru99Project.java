package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {
	ChromeDriver driver;
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/v4/");

}
 public void login(String userId,String Password) {
 
	 WebElement username = driver.findElement(By.name("uid"));
	 username.sendKeys(userId);
	  driver.findElement(By.name("password")).sendKeys(Password);
	 driver.findElement(By.name("btnLogin")).click();
 }
 public void addCustomer() {
	 driver.findElement(By.linkText("New Customer")).click();
	 driver.findElement(By.name("name")).sendKeys("Payal");
	 driver.findElement(By.xpath("//input[@value='f']")).click();
	 driver.findElement(By.id("dob")).sendKeys("03/17/1984");
	 driver.findElement(By.name("addr")).sendKeys("Vadodara \n Gujarat");
	 driver.findElement(By.name("city")).sendKeys("Vadodara");
	 driver.findElement(By.name("state")).sendKeys("Gujarat");
	 driver.findElement(By.name("pinno")).sendKeys("390011");
	 driver.findElement(By.name("telephoneno")).sendKeys("2017441852");
	 
 String emailId = "aa"+System.currentTimeMillis()+"@gmail.com";
	 System.out.println("Email ID:"+ emailId);
	 
	 driver.findElement(By.name("emailid")).sendKeys(emailId);
	 driver.findElement(By.name("password")).sendKeys("abcdef");
	 driver.findElement(By.name("sub")).click();
 }
 public String getCustomerId() {
	 return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
 }
  
 
 public void addAccount(String CustomerId) {
	 driver.findElement(By.linkText("New Account")).click();
	 driver.findElement(By.name("cusid")).sendKeys(CustomerId);
	 
	 WebElement accountDropdown = driver.findElement(By.name("selaccount"));
	 
	 Select selectAccount = new Select(accountDropdown);
	 
	 selectAccount.selectByVisibleText("Current");
	 
	 System.out.println(selectAccount.isMultiple());
	 
	 System.out.println(selectAccount.getWrappedElement());
	 
	 driver.findElement(By.name("inideposit")).sendKeys("50000");
	 driver.findElement(By.name("button2")).click();
	 
	 
 }
}
 
 
 
 
 
 