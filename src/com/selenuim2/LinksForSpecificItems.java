package com.selenuim2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksForSpecificItems {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println("Title: " +driver.getTitle());
		System.out.println("CurrentURL: " +driver.getCurrentUrl());
	
		//<div class="navFooterColHead">Get to Know Us</div>
		////div[text()='Get to Know Us']/parent::div     this is xpath for parent
		WebElement block = driver.findElement(By.xpath("//div[text()='Get to Know Us']/parent::div"));
		//We want to find to find element only in block hence we aren't using driver. option above
		
		
		List<WebElement>  allLinks=block.findElements(By.tagName("a"));
		for (int i=0; i<allLinks.size(); i++ )
				{
			
				System.out.println(allLinks.get(i).getAttribute("href"));
			
				allLinks.get(i).click();
				System.out.println("Current URL: " +driver.getCurrentUrl());
				Thread.sleep(4000);
				driver.navigate().back();
				//As we had stale Element due to dynamic values we copied the below to recreate them 
				 block = driver.findElement(By.xpath("//div[text()='Get to Know Us']/parent::div"));
				 allLinks=block.findElements(By.tagName("a"));
				}
		
		Thread.sleep(4000);
		driver.quit();
	}

}
