package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BaseClass {

	@Test
	public void duplicateLead() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmugapriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alagarsamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shanmugapriya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Shanmugapriya from QA Team");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanmugapriyaalagarsamy@gmail.com");
		WebElement stateelement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ddstateelement = new Select(stateelement);
		ddstateelement.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title of the page is: "+ driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WoolWorths");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan");
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivashanmugam");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title of the page is: " + driver.getTitle());

	}

}
