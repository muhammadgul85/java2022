package com.test.ng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoWindowsHandling {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.24hourfitness.com/");
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
	public void clickOnFaceBookLink() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		String fitnessURL = driver.getWindowHandle();//Current window handle
		System.out.println(fitnessURL);
				
		driver.findElement(By.xpath("//a[@id='at-facebook']")).click();
		
		Set<String> windowID = driver.getWindowHandles();
		
		Iterator<String> it = windowID.iterator();
		while(it.hasNext())
		{
			String window = it.next();//will give you window ID
			
			driver.switchTo().window(window);
			if(driver.getCurrentUrl().contains("facebook.com"))
			{
								
				System.out.println("Title of facebook window: " +driver.getTitle());
				
				String expectedTitle = "24 Hour Fitness - Home";
				Assert.assertEquals(driver.getTitle(), expectedTitle);				
			}
						
		}
		driver.switchTo().window(fitnessURL);
		WebElement instagram = driver.findElement(By.xpath("//a[@id='at-instagram']"));
		instagram.click();
		
		windowID = driver.getWindowHandles();
		
		it = windowID.iterator();
		while(it.hasNext())
		{
			String window = it.next();//will give you window ID
			
			driver.switchTo().window(window);
			if(driver.getCurrentUrl().contains("instagram.com"))
			{
				
				
				System.out.println("Title of instagram window: " +driver.getTitle());
				
				String expectedTitle = "24 Hour Fitness (@24hourfitness) • Instagram photos and videos";
				Assert.assertEquals(driver.getTitle(), expectedTitle);
				
				
				
				
			}
			
			
			
		}
		
		driver.switchTo().window(fitnessURL);
		
		
	}
	
	
	
	
	

}
