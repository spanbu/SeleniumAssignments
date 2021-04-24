package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anbu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S P");
		WebElement eleDropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(eleDropDown1);
		dd1.selectByVisibleText("Existing Customer");
		WebElement eleDropDown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(eleDropDown2);
		dd2.selectByVisibleText("Demo Marketing Campaign");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Babu");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Test1");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/24/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sel Prgm");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QEA");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("25000");
		WebElement eleDropDown3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3 = new Select(eleDropDown3);
		dd3.selectByVisibleText("DZD - Algerian Dinar");
		WebElement eleDropDown4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd4 = new Select(eleDropDown4);
		dd4.selectByVisibleText("Health Care");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("9000");
		WebElement eleDropDown5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd5 = new Select(eleDropDown5);
		dd5.selectByVisibleText("LLC/LLP");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SIC 1");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ON");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is first sel code");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Complete by EOD");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("005");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987564321");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("435");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("spanbu.1986@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Joseph");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Kennedy");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("7-24/34");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("JTS Avenue");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Mid Land");
		WebElement eleDropDown6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd6 = new Select(eleDropDown6);
		dd6.selectByVisibleText("Texas");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("73301");
		WebElement eleDropDown7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd7 = new Select(eleDropDown7);
		dd7.selectByVisibleText("United States");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("78839");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.className("smallSubmit")).click();
		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text1);
		String CompName = text1.replaceAll("[^a-zA-Z]", "");
		System.out.println(CompName);
		if(CompName.equals("HCL")) {
			System.out.println("Expected");
		}
			else {
				System.out.println("Unexpected");
			}
	driver.close();	
	}
		
		
	}


