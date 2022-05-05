package testNG;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead extends BaseClass {	
	@Test
	public void createlead()
	
	{
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmugapriya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alagarsamy");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shanmugapriya");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Management");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Shanmugapriya Alagarsamy from management department");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanmugapriya.alagarsamy@gmail.com");
	
	WebElement elementStateprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select statedd = new Select(elementStateprovince);
	statedd.selectByVisibleText("New York");
	
	WebElement elementsourcedd= driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select sourcedd = new Select(elementsourcedd);
	sourcedd.selectByVisibleText("Employee");
	
	driver.findElement(By.name("submitButton")).click();
	
	String title = driver.getTitle();
	System.out.println("The title is " + title );
	
		
	}
	
	

}
