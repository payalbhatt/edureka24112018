package day8;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class GuruProject {
    WebDriver driver;
    @Parameters("browserType")
	@BeforeClass
	public void invokeBrowser(String browserType) {

		if (browserType.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserType.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\geckodriver-v0.23.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (browserType.equals("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\microsoftwebdriver.exe");

			driver = new EdgeDriver();

		}
driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://demo.guru99.com/v4/");
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@Test(priority = 0)
	public void verifyTitleOfThePage() {
		String ExpectedTitle = "Guru99 Bank Home Page1";
	    String ActualTitle= driver.getTitle();
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@Parameters({"userID","Password"})
	@Test(priority= 1000)
	public void loginGuruWebsite(String userID,String Password) {
		WebElement username = driver.findElement(By.name("uid"));
		 username.sendKeys(userID);
		  driver.findElement(By.name("password")).sendKeys(Password);
		 driver.findElement(By.name("btnLogin")).click();
	}
}
