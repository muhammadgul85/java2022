package com.practice.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertInJavScr {
	
	WebDriver driver;	
	
	@BeforeClass
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.manage().window().maximize();
		}
	@AfterClass
		public void tearDown() throws InterruptedException 
		{
			Thread.sleep(5000);
			driver.quit();
		}
	@Test
	
	public void alertJS()
	{
		//Click on Sign in button, Alert will pop over
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert a1 = driver.switchTo().alert();
		System.out.println("Alert Text is: " +a1.getText());
		System.out.println("Class is: " +a1.getClass());
		a1.accept();
		
		
		
	}

}
