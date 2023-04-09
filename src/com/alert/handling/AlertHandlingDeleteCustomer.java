package com.alert.handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandlingDeleteCustomer {
	WebDriver driver; 
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.quit();
	}
	@Test
	public void deleteCustomer()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Title of Page: " +driver.getTitle());
		//Below credential for manager valid until 30 days
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr266311");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("YvuzYtY");
		
		driver.findElement(By.xpath("//span[text()='Accept All']/ancestor::button")).click();   //("/html/body/app-root/app-theme/div/div/app-notice/app-theme/div/div/app-home/div/div[2]/app-footer/div/div[2]/app-action-buttons/div/button[3]/span[1]/div/span")).click();
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click on Delete Customer to delete customer
		driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
		
		//Close the Add 
		WebElement closeAdd = driver.findElement(By.xpath("//div[@id='dismiss-button']"));
		closeAdd.click();
		
		//Delete Customer Form, provide customer ID 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		
		//Handle Alert, Get the message and accept to delete customer
		Alert alert = driver.switchTo().alert();
		System.out.println("Message after clicking to delete: " +alert.getText());
		alert.accept();
		
		//Second Alert message and accept to delete
		Alert alert2 = driver.switchTo().alert();
		System.out.println("Second Alert message: " + alert2.getText());
		alert2.accept();
		
		System.out.println("Title of Page: " +driver.getTitle());
		
		
	}
	
	
	
	
	
}
