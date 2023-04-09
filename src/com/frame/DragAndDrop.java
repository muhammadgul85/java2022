package com.frame;


// dragAndDrop() and perform() method 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver; 
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		
		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		String DomainUsingJS = (String) javascript.executeScript("return document.domain");
		System.out.println("MyCurrentURL is: " +DomainUsingJS);
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown1() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of Programe");
	}
	
	@Test
	public void dragDropItem1() throws InterruptedException
	{
		driver.switchTo().frame(0);//"demo-frame"frame(String) ==> string can be id or name attribute value
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		actions.dragAndDrop(source, destination).perform();
		Thread.sleep(5000);
		
	}
	

}
