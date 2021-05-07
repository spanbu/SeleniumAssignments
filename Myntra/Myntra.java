package week3.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//1) Open https://www.myntra.com/
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//2) Mouse over on WOMEN		
		Actions actions = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("//a[text() = 'Women']"));
		actions.moveToElement(women).perform();
//3) Click Jackets & Coats		
		//WebElement jacketsCoats = driver.findElement(By.xpath("//a[text() = 'Jackets & Coats']"));
		//jacketsCoats.click();
		driver.findElement(By.xpath("//a[text() = 'Jackets & Coats']")).click();
//4) Find the total count of item 
		String count = driver.findElement(By.xpath("//div[@class = 'title-container']")).getText();
		String totalCount = count.replaceAll("[^0-9]", "");
//5) Validate the sum of categories count matches
		int total = Integer.parseInt(totalCount);
		System.out.println(total);
		String jacketsCount = driver.findElement(By.xpath("(//span[@class = 'categories-num'])[1]")).getText();
		String jackCount = jacketsCount.replaceAll("[^0-9]", "");
		int category1Count = Integer.parseInt(jackCount);
		System.out.println(category1Count);
		
		String coatsCount = driver.findElement(By.xpath("(//span[@class = 'categories-num'])[2]")).getText();
		String coatCount = coatsCount.replaceAll("[^0-9]", "");
		int category2Count = Integer.parseInt(coatCount);
		System.out.println(category2Count);
		
		
		int categoryCount = category1Count+category2Count;
		if(total == categoryCount) {
			System.out.println("Total and category count matches");
		}
		
//6) Check Coats
		WebElement coatsCheckBox = driver.findElement(By.xpath("//input[@value = 'Coats']//following-sibling::div"));
		coatsCheckBox.click();
//7) Click + More option under BRAND			
		WebElement moreOption = driver.findElement(By.xpath("//div[@class = 'brand-more']"));
		moreOption.click();
//8) Type MANGO and click checkbox		
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("MANGO");
//9) Close the pop-up x
		driver.findElement(By.xpath("//span[@class = 'FilterDirectory-count']//following-sibling::div")).click();
		
		driver.findElement(By.xpath("//ul[@class = 'FilterDirectory-indices']//following-sibling::span")).click();
		
		Thread.sleep(5000);
//10) Confirm all the Coats are of brand MANGO		
		List<WebElement> brandNames = driver.findElements(By.xpath("//h3[@class = 'product-brand']"));
		boolean isMango = true;
		for (int i = 0; i < brandNames.size(); i++) {
			String name = brandNames.get(i).getText();
			if (name.equals("MANGO") == false) {
				isMango = false;
				System.out.println("Brand Names are different");
				break;
			}
		}
		if(isMango) {
			System.out.println("All Brand Names are 'MANGO'");
		}
//11) Sort by Better Discount		
		driver.findElement(By.xpath("//div[@class = 'sort-sortBy']")).click();

		driver.findElement(By.xpath("//input[@value = 'discount']/parent::label")).click();
		Thread.sleep(5000);
//12) Find the price of first displayed item				
		String firstItem = driver.findElement(By.xpath("//span[@class = 'product-discountedPrice']")).getText();
		String first = firstItem.replaceAll("[^0-9]", "");
		int firstItemPrice = Integer.parseInt(first);
		
		System.out.println("Price of first item is "+firstItemPrice);
//13) Mouse over on size of the first item		
		WebElement itemSize = driver.findElement(By.xpath("//span[@class = 'product-discountedPrice']"));
		actions.moveToElement(itemSize).perform();
//14) Click on WishList Now
		
		driver.findElement(By.xpath("//div[@class = 'product-actions ']")).click();
		Thread.sleep(5000);
//15) Close Browser		
		driver.close();

	}

}
