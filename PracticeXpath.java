package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//1. Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//2. Enter the username based on its label
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		//3. Enter the password based on its label
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//4. Click Login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//5. Click on CRMSFA link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//6. Click on Leads link
		driver.findElement(By.xpath("//a[text()='Leads']/parent::div")).click();
		//7. Click on Merge Leads link
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeLeadsForm']")).click();
		//8. Click the first img icon
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		driver.manage().window().maximize();
		//9. Select the first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		Thread.sleep(5000);
		//10. Click the second img icon
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(5000);
		//11. Select the second resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		//12. Click on Merge Lead (submit) button
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//13. Get the company name text based on its label
		String com_name = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("Company Name is: " + com_name);
		
		
		}

}
