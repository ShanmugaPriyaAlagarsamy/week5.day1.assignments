package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;

	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className ("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void postcondition() {
				driver.close();
 
	}
	
}
