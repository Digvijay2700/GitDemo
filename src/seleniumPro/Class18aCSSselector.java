package seleniumPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class18aCSSselector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/C:/Users/hp/Desktop/Automation Selenium/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("digvijaypatil7295@gmail.com");
	}

}
