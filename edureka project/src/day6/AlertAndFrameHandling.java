package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertAndFrameHandling {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
 driver.switchTo().frame("iframeResult");
 // to come out of a frame
  //driver.switchTo().defaultContent();
  driver.findElement(By.tagName("button")).click();
       Alert alert =  driver.switchTo().alert();
       
       System.out.println(alert.getText());
       Thread.sleep(5000);
       alert.accept();
	}

}