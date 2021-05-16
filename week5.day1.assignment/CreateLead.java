package week5.Day1.Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@Test
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anbu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("spanbu.1986@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("077");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("95225185");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}