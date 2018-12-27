package day7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageUpload {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\Desktop\\PAYALQA\\QA\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://images.google.com/");
		driver.findElement(By.className("S3Wjs")).click();
		driver.findElement(By.linkText("Upload an image")).click();
		driver.findElement(By.id("qbfile")).click();
		Runtime.getRuntime().exec("C:\\Users\\payal\\gitedureka24112018\\edureka project\\AutoIT\\Image2\\Upload Image2.exe");

	}

}
