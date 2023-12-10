package seleniumPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class19ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/C:/Users/hp/Desktop/Automation Selenium/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("digvijaypatil7295@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password987");
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("div.show")).getText());
		driver.close();
	}
}
