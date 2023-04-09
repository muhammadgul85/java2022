package com.synchronisation.wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FluentWaitEx {
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
		driver.quit();
	}
	
	@Test
	public void ExplicitWaitTest()
	{
		FluentWait<WebDriver> myWait =	new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofMillis(300))
		.ignoring(NoSuchElementException.class);
		
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ribbon_home_top']/parent::div"))).click();                   //("//div[@class='slide-container']/descendant::a[contains(text(),'GYM PASS')])[2]"))).click();//"(//a[text()='Gym Pass'])[1]\""))).click(); //here as well rather than below
		
		
	//	driver.findElement(By.xpath("(//a[text()='Gym Pass'])[1]")).click();////div[@class='slide-container']/descendant::a[contains(text(),'GYM PASS')])[2]
				
		
	}

}
