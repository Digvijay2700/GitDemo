package seleniumPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class21xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/C:/Users/hp/Desktop/Automation Selenium/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7410747100");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7709730085");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		
		driver.findElement(By.xpath("//div/input")).sendKeys("7410747100");  //parent-child xpath locator
		
		
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
	}
}
