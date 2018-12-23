package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {
	WebDriver driver;
	List<WebElement>allLink;


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
Dimension dim = new Dimension(768, 1024);
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
	}
	public void searchProduct(String Product,String Catagory) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Product);
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		Select selCatagory = new Select(dropDown);
		selCatagory.selectByVisibleText(Catagory);
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@value='Go']")).click();
		String result = driver.findElement(By.id("s-result-count")).getText();
		System.out.println("Result :"+result);
	}

		
	}
	
	

