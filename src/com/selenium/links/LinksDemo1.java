package com.selenium.links;

import java.util.List;

import org.openqa.selenium.By;

//Validate Links and Broken Links with in the whole Page

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		List<WebElement>  allLinks = driver.findElements(By.tagName("a"));
		
		//Skip the links that aren't available
	
		for (int i=0; i<allLinks.size(); i++)
		{
			
		
		if (!(allLinks.get(i).getText().isEmpty() || allLinks.get(i).getText().contains("@")))
		{
			System.out.println(allLinks.get(i).getAttribute("href"));
			allLinks.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
		}
		driver.quit();
	}

}
