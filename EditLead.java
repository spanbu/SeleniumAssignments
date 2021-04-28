package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//8	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anbu");
		//9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//10 Click on first resulting lead
		//String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		//System.out.println("LeadID : " + leadID);
		//11 Verify title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);
		//11a verify the company name displayed in view page
		String compName1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String oldComp = compName1.replaceAll("[^a-zA-Z]", "");
		System.out.println("Company Name: " + oldComp);
		//12 Click Edit
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		//13 Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("WonderWolf");
		//14 Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// 15 Confirm the changed name appears
		String compName2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String newComp = compName2.replaceAll("[^a-zA-Z]", "");
		System.out.println("Updated company name is: " + newComp);
		if(oldComp.equals(newComp)) {
			System.out.println("Both company names are same");
		}
			else {
				System.out.println("Updated Company name is differs from old company name");
							
		}
		//16 Close the browser (Do not log out)
		driver.close();
	
	}

}
