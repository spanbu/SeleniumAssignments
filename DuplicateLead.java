package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		//8	Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//9	Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("spanbu.1986@gmail.com");
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//11	Capture name of First Resulting lead
		String firstName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).getText();
		//System.out.println(firstName);
		String lastName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])[1]")).getText();
		System.out.println("Captured Lead Name is: " + firstName + " " + lastName);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		Thread.sleep(3000);
		//13	Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//14	Verify the title as 'Duplicate Lead'
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is: " + pageTitle);
		//15	Click Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		//16	Confirm the duplicated lead name is same as captured name
		String dupFirstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		String dupLastName = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println("Lead Dup Name is: " + dupFirstName + " " + dupLastName);
		if(dupFirstName.equals(firstName) && dupLastName.equals(lastName)) {
			System.out.println("Dup Lead Name is same as Captured Lead Name");
		}
		else {
			System.out.println("Dup Lead Name is not same as Captured Lead Name");
		}
		//17	Close the browser (Do not log out)
		//driver.close();
	}
	

}
