package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Delete Lead:
		//http://leaftaps.com/opentaps/control/main
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
		//8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("897654321");
		//10	Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		//11	Capture lead ID of First Resulting lead
		String  leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		System.out.println(leadID);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		Thread.sleep(3000);
		//13	Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		//16	Click find leads button
		//driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(6000);
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		boolean textDisplayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		if(textDisplayed) {
			System.out.println("Lead ID is successfully deleted");
		}
		else {
			System.out.println("Lead is not deleted");
		}
		//18	Close the browser (Do not log out)
		//driver.close();

	}

}
