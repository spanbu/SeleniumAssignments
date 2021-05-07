package week3.day2.assignments;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MapInSelenium {

	public static void main(String[] args) throws InterruptedException {

//		1) Set the property
		WebDriverManager.chromedriver().setup();
//		2) Initiate ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
//		3) Launch the URL - https://erail.in/
		driver.get("https://erail.in/");
//		4) Maximize the browser
		driver.manage().window().maximize();
//		5) Add implicityWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		6) Clear and type in the from station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("SCT");
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
//		7) Clear and type in the to station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MS");
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
//		8) Uncheck the 'Sort on Date' checkbox	
		driver.findElement(By.id("chkSelectDateOnly")).click();
//		9) Declare a Map
		Map<String, String> tableData = new LinkedHashMap<String, String>();
//		10) Store the table in a web element
		WebElement table = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']"));
//		11) Get all the rows and store it in a List		
		List<WebElement> tableRows = table
				.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr"));
//		12) Iterate the rows and store all the columns in a List
		for (WebElement webElement : tableRows) {
			List<WebElement> tableCol = driver
					.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr/td"));
			for (WebElement webElement2 : tableCol) {
//		13) Check and get the values that start with 'S'
				if (webElement2.getText().startsWith("S")) {
//		14) If the condition satisfies add it into the map as key & 	value
					tableData.put(webElement2.getText(), webElement2.getText());
				}
			}
		}
//		15) Print those values by iterating the map
		System.out.println(tableData);
	}

}
