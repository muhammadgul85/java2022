package com.test.ng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowsTestHandlingWithCommonMethod {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
				
		Thread.sleep(4000);
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void multipleWindowsTest() throws InterruptedException
	{
		String homeWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		//Switch to Google Play window
		switchToWindow("Adactin Hotel App - Apps on Google Play");
		
		driver.findElement(By.xpath("//span[text()='Games']/ancestor::button")).click();
		Thread.sleep(5000);
		driver.switchTo().window(homeWindowId);
		
		//click on iOS on home page
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		//Switch to the newly opened iOS Tab/window
		switchToWindow("TestFlight - Apple");
		
		//Click on Terms and Services at the bottom of Page
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		driver.switchTo().window(homeWindowId);
		
		//Switch to the newly opened window for which Title is given below
		switchToWindow("Legal - Apple Media Services - Apple");
	}
	private void switchToWindow(String expTitle)//Common Method
	{
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			if(driver.getTitle().equals(expTitle))
			{
				break;
			}
		}
	}
	
	
	
	
	
	
}
