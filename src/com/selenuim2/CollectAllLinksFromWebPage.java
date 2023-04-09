package com.selenuim2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectAllLinksFromWebPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.amazon.co.uk/");
		 driver.manage().window().maximize();
		 System.out.println("Title is: "+driver.getTitle());
		 
		 List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		 System.out.println("no of links: "+alllinks.size());
		 
		 for(WebElement link : alllinks)
		 {
			System.out.println( link.getText()); 
		 }
		 
		driver.quit();
		
	}

}
