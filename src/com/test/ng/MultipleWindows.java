package com.test.ng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
	
	WebDriver driver; //Instance variable driver Declaration, not initiliased 
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void multipleWindowsTest()
	{
		String homeWindowId = driver.getWindowHandle();//to capture the URL of the current window and store it in the object created for it which is string
		
		// <img src="img/google-play.png">
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		//Get Window ID's,  as by clicking above it has opened another tab/window
		Set<String> windowID = driver.getWindowHandles();
		
		
		
		Iterator<String> it = windowID.iterator();
		
		while(it.hasNext())
			
		{
			
			driver.switchTo().window(it.next());//.next() will give you window ID which is string
			if(driver.getTitle().equals("Adactin Hotel App - Apps on Google Play"))
			{
				break;
			}
			else
			{
				
			}
		}
		
		
		//Select Games on the new window    xpath axes:(Parent,Sibling,Child)  //span[text()='Games']/parent::span/parent::button
				driver.findElement(By.xpath("//span[text()='Games']/ancestor::button"));
		
		//Switch to home window
				
				driver.switchTo().window(homeWindowId);
		
	}

}
