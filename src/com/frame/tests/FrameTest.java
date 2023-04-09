package com.frame.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.angelfire.com/super/badwebs/");
		driver.manage().window().maximize();
				
		Thread.sleep(4000);
	}
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		//driver.quit();
	}
	@Test
	public void frameWorkSwitching()
	{
		
//index starts from 0 , from top to bottom of DOM
//2)frame(String) ==> string can be id or name attribute value
//3)frame(WebElement)
		//driver.switchTo().frame(1);  1)frame(int) ==> int means index value should be calculated manually

	    //	driver.switchTo().frame("contents"); //Best Way
		driver.switchTo().frame("contents");//(By.xpath("//frame[@target='main']")).click();
		
		//<font color="#3399ff">The		"I Hate Frames" Frames Page</font> //we will use contains 
		driver.findElement(By.xpath("(//font[contains(text(),'I Hate Frames')]/parent::a)[1]")).click(); //(//font[contains(text(),'I Hate Frames')]/parent::a)[1]
	}

}
