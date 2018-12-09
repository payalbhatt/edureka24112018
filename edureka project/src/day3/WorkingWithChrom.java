package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrom {

	ChromeDriver driver;
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\chromedriver.exe");
		
  driver = new ChromeDriver();
  Dimension dim = new Dimension(768,1024);
  driver.manage().window().setSize(dim);
  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.edureka.co/");
		}
	public void printTitle() {
		System.out.println(driver.getTitle());
	}
	
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
}
