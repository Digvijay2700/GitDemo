package seleniumPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Class23SLogin {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "rahul";
		
		System.setProperty("webdriver.chrome.driver", "/C:/Users/hp/Desktop/Automation Selenium/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(3000);
		String A = driver.findElement(By.tagName("p")).getText();
		String B = driver.findElement(By.tagName("h2")).getText();
		
		
		System.out.println(A);
		System.out.println(B);
		
		Assert.assertEquals(A, "You are successfully logged in.");
		Assert.assertEquals(B, "Hello "+ name + ",");
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		}
		
}
