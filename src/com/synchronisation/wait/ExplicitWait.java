package com.synchronisation.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {
	WebDriver driver; 
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown () throws InterruptedException
	{
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test
	public void ExplicitWaitTest()
	{
		//Selenium.support.ui   WebDriverWait Class and WebDriverWait Constructor will be used here
		//new WebDriverWait(driver, 30); //condition is wait until Gym Pass is visible on web Page
		WebDriverWait myWait = new WebDriverWait(driver, 30);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Gym Pass'])[1]\"")));//you can use .click() here as well rather than below
		
		
		driver.findElement(By.xpath("(//a[text()='Gym Pass'])[1]")).click();////div[@class='slide-container']/descendant::a[contains(text(),'GYM PASS')])[2]
				
		
	}

}
