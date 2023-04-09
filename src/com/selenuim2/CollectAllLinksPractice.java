package com.selenuim2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectAllLinksPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Title of WebPage: " + driver.getTitle());
		System.out.println("URL is: " +driver.getCurrentUrl());
		System.out.println("******************");
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		for (int i=0; i<allLinks.size(); i++)
		{
			if(!(allLinks.get(i).getText().isEmpty() || allLinks.get(i).getText().contains("@")))
			{
				System.out.println("href value: " +allLinks.get(i).getAttribute("href"));
				allLinks.get(i).click();
				Thread.sleep(4000);
				System.out.println("Current URL: " +driver.getCurrentUrl());
				driver.navigate().back();
			}
			
		}
		
		
		driver.quit();
	}

}
