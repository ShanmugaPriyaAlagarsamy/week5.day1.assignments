package testNG;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps extends BaseClass {	
	@Test(invocationCount=2, priority =-1, enabled=true)
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
	
	@Test ( priority = 1, enabled=false)
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

	@Test (priority = 2, enabled=true)
	public void editLead() {
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
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note to team is to complete testing in 2 days");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title of the page is: " + driver.getTitle());
				

	}
	
	@Test (enabled=true)
	public void updatestatecontactlead() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')] [contains(@href,'/crmsfa/control/leadsMain')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/createLeadForm')][contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Microsoft");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Akshara");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Manikandan");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("This is Akshara from Microsoft");
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId'][@id='createLeadForm_generalStateProvinceGeoId']"));
		Select statedd = new Select(state);
		statedd.selectByVisibleText("New York");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9543511379");
		driver.findElement(By.xpath("//input[@class='smallSubmit'][@name='submitButton']")).click();
		
	}
	
	

}
