package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main (String [] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		System.out.println("Assignment one ");
		
		//assignment one
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("5_Roes");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Salik");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bhai");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test engineer");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TTest engineers are responsible for "
			                                          	+ "designing and implementing the tests that ensure the");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mohammadsalikcse@gmail.com");
		
		WebElement stateSelection= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select select =new Select(stateSelection);
		
		select.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Assignment two ");
		
		//assignment two]
		
		
		
		driver.findElement(By.linkText("Edit")).click();
		
	
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		System.out.println("Description is cleared");
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Assignment two completed");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(6000);
		
		driver.manage().window().minimize();
		
		System.out.println(" Testcase completed ");
		
				
	}

}
