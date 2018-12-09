package assignment;


import org.openqa.selenium.firefox.FirefoxDriver;

public class class2 {
	public static void main(String[] args) {
	FirefoxDriver driver;



		System.setProperty("webdriver.gecko.driver","C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.edureka.co/");
	
	


	

	}

}
