package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	public String getTextFromLink() {
		String url = driver.findElement(By.linkText("Your Amazon.com")).getAttribute("href");
		return url ;
	}
	public int getCountOfLinks() {
		allLink = driver.findElements(By.tagName("a"));
		return allLink .size();
	}
	public void printAllLinks() {
		for (WebElement link : allLink) {
			System.out.println("Link Text:"+link.getText()+
					"and Url:"+link.getAttribute("href"));
		}
}
}