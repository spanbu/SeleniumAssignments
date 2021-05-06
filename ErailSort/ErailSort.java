package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser

		// Launch the URL - https://erail.in/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");

		// Uncheck the check box - sort on date

		// clear and type in the source station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Mas");
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		// clear and type in the destination station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("TEN");
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("buttonFromTo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		// Find all the train names using xpath and store it in a list
		List<WebElement> train = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody//tr//td[2]"));
		List <String> lst = new ArrayList<String>();
		for(int i =0; i< train.size();i++) {
			String list = train.get(i).getText();
			lst.add(list);
			System.out.println(list);
		}
		// Use Java Collections sort to sort it and then print it
		
		Collections.sort(lst);
		System.out.println("Sorted Trains: " + lst);
	}

}
