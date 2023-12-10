package seleniumPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class18cssPC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/C:/Users/hp/Desktop/Automation Selenium/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("")).sendKeys("digvijay");
		driver.findElement(By.cssSelector("")).sendKeys("7709730085");
		driver.findElement(By.cssSelector("")).click();
	}
}
