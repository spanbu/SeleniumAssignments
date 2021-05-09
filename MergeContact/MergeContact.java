package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
		
		// Click on Widget of From Contact
		driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
		// Window handles
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listOfWindows = new ArrayList<String>(allWindows);

		// Move to From Contact window
		driver.switchTo().window(listOfWindows.get(1));
		Thread.sleep(2000);

		// Select the first contact
		driver.findElement(
				By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.click();

		// Switch control to parent window
		driver.switchTo().window(listOfWindows.get(0));

		// Click on To Contact icon
		driver.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();

		// Getting current windows
		allWindows = driver.getWindowHandles();
		listOfWindows = new ArrayList<String>(allWindows);

		// Move to To Contact window
		driver.switchTo().window(listOfWindows.get(1));
		Thread.sleep(2000);

		// Select the first contact
		driver.findElement(
				By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]"))
				.click();

		// Switch control to parent window
		driver.switchTo().window(listOfWindows.get(0));

		// Click on Merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		// Accept alert
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Confirm the title
		System.out.println(driver.getTitle());

	}

}
