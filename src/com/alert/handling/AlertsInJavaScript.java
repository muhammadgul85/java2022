package com.alert.handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsInJavaScript {
	
	WebDriver driver ;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void alertHandle()
	{
		//Click on Sign in button, Alert will pop over
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//Alert alert = new Alert();//Cannot instantiate or cannot create object, the type Alert as it's interface
		Alert alert = driver.switchTo().alert();
		System.out.println("text of alert: " + alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Mo Gul");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("efghhhh");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		
		//
		
	}
	
	
	
}
