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

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
//  1) Set the property
		WebDriverManager.chromedriver().setup();
//	2) Initiate ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
//	3) Launch the URL - https://erail.in/
		driver.get("https://erail.in/");
//	4) Maximize the browser
		driver.manage().window().maximize();
//	5) Add implicityWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	6) Clear and type in the from station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("SCT");
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
//	7) Clear and type in the to station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MS");
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
//	8) Uncheck the 'Sort on Date' checkbox	
		driver.findElement(By.id("chkSelectDateOnly")).click();
//		Store all the train names in a list
		Map<Integer,String> trainNamesMap = new LinkedHashMap<Integer,String>();
		WebElement table = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']"));
		List<WebElement> trainNames = table.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr/td[2]"));
//		Get the size of it
		int sizeoftrainNames = trainNames.size();
//		Add the list into a new Set
		for (int i = 0; i < sizeoftrainNames; i++) {
			trainNamesMap.put(i+1, trainNames.get(i).getText());
		}
//		And print the size of it
		System.out.println("Map size - "+trainNamesMap.size());
		System.out.println(trainNamesMap);
	}

}
