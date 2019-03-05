package day7;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class GuruProject {
    ChromeDriver driver;
	@BeforeClass
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/");
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@Test(priority = 0)
	public void verifyTitleOfThePage() {
		String ExpectedTitle = "Guru99 Bank Home Page";
	    String ActualTitle= driver.getTitle();
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@Test(priority= 1000,enabled =false)
	public void loginGuruWebsite() {
		
	}
}
