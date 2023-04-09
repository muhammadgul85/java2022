package com.test.ng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTheContentsInList {
WebDriver driver; //Instance variable driver Declaration, not initiliased 
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try
		{
			WebElement accept_cookies = driver.findElement(By.id("save"));//("//span[text()='Accept All']/ancestor::button"));////span[text()='Accept All
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(accept_cookies)).click();
			
			//wait.until(ExpectedConditions.elementToBeClickable(accept_cookies)).click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Pop up didn't occur");
		
		}
		
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait until expected condition meets		
		
		//Accept All
		//driver.findElement(By.xpath("//button[@class='mat-focus-indicator solo-button mat-button mat-button-base mat-raised-button']")).click();
		
		//Reject All Cookies <span class="mat-button-wrapper"><div _ngcontent-lyb-c55="" class="action-wrapper" style="font-size: 14px;"><span _ngcontent-lyb-c55="">Accept All</span></div></span>
		//driver.findElement(By.xpath("//button[@id='denyAll']")).click();
		
		
		//Reject All Confirmation
		//driver.findElement(By.xpath("//span[text()='Reject']")).click();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.quit();
	}
	
	@Test
	public void verifyTheContents() throws InterruptedException
	{
		
		Thread.sleep(2400);	
		//Click on JMeter Easy(iFrame) and capture new window title 
		driver.switchTo().frame("a077aa5e");//frame(2);//"a077aa5e" frame name 
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click(); //("//img[contains(@src,'Jmeter720')]"));//img[@src='Jmeter720.png']")).click();//<img src="Jmeter720.png">
		System.out.println("New Window title: "+driver.getTitle());
		Thread.sleep(2000);
		
		//Having trouble here ! 
		//WebElement toptutorial =  driver.findElement(By.xpath("//h2[text()='Top Tutorials']/parent::div"));
		List<WebElement> toptutorial = driver.findElements (By.xpath("//h2[text()='Top Tutorials']/ancestor::div"));
		
		//Capture Elements in the list and store
		List<WebElement> li = driver.findElements(By.tagName("h5"));
		
		System.out.println("Size of toptutorial list of elements: "+ toptutorial.size());//not necessary but for info we are printing it 
		
		
		List<String> alList = new ArrayList<String>();
		for (int i=0; i<li.size();i++)
		{
			//add the newly captured String Elements into the list
			alList.add(li.get(i).getText());
			System.out.println(li.get(i).getText());
		}
		
		String [] expTitles = {"Python",""};
		for (int i=0; i<li.size();i++)
		{
			Assert.assertEquals(alList.get(i), expTitles[i]);
		}
		
		
		
		
		
		
		
	/*	Set<String>windows = driver.getWindowHandles();
	
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			String winID = it.next();
			driver.switchTo().window(winID);
			
			if(driver.getTitle().equals("Selenium Live Project: FREE Real Time Project for Practice"))
			{
				for(int i=0; i<=windows.size(); i++)
				{
					
				}
			}
		}
		*/
	}
	
	
	

}
