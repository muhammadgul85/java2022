package com.practice.selenium;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private WebDriver driver;
	
	public void setUp() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3999);
	
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		ArrayList link = (ArrayList) driver.findElements(By.tagName("a"));
		System.out.println("Size of linklist is: " +link.size());
		
		for (WebElement t : linklist)
		{
			System.out.println(t.getText());
		}
		
		WebElement inputLink = driver.findElement(By.linkText("Inputs"));
		inputLink.click();
		
		System.out.println("Title: " +driver.getTitle());
		Thread.sleep(4000);
		driver.quit();
		
		try
		{
			WebElement inLink = driver.findElement(By.linkText("angie"));
			inLink.click();
		
		}
		catch (Exception e)
		{
			System.out.println("Angie Element not found: ");
			
		}
		
	}

	public static void main(String[] args)throws InterruptedException {

		BaseClass test = new BaseClass ();
		test.setUp();
		 

	}

}
