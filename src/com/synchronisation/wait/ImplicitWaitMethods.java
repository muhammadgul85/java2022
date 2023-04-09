package com.synchronisation.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImplicitWaitMethods {
	WebDriver driver; 
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.zoho.com/sign/signup.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	@Test
	public void waitTest() throws InterruptedException
	{
		//Hard wait 
		//Thread.sleep(5000);		
		
		driver.findElement(By.xpath("//div[@class='za-tos-container']")).click();
		
			
	} 
	

}
