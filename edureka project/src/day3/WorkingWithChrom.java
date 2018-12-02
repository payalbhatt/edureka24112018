package day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrom {

	ChromeDriver driver;
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.edureka.co/");
		
	
	}
}
