package seleniumPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class24 {

	public static void main(String[] args) throws InterruptedException {
		
        String name = "rahul";
		
		System.setProperty("webdriver.chrome.driver", "/C:/Users/hp/Desktop/Automation Selenium/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String Password = getPassword(driver);
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(3000);
		String A = driver.findElement(By.tagName("p")).getText();
		String B = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(A);
		System.out.println(B);
	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] passArray = passtext.split("'");
		String[] passArray2 = passArray[1].split("'");
		String password = passArray2[0];
		return password;
	}

}
