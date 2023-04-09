package com.frame.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchFrame {
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
	public void switchFrame () throws InterruptedException
	{
		String homeWindID = driver.getWindowHandle();
		driver.switchTo().frame(1);//NoSuchFrameException for //frame[@target='main']
		
		System.out.println("Frame 1 Found");
		Thread.sleep(2000);
		
		// <font color="#3399ff">The	"I Hate Frames" Frames Page</font>
		driver.findElement(By.xpath("(//font[contains(text(),'I Hate Frames')]//ancestor::a)[1]")).click();////Method 2 for xpath: //font[contains(text(),'I Hate Frames')][1]/parent::a     
	    driver.switchTo().window(homeWindID);
	    
	    //You 've to be in on main page to switch from one frame to another, use default method
	    driver.switchTo().defaultContent();
	    //move to frame 3
	    driver.switchTo().frame("main"); //frame(2);//No Frame Exception "//frame[@target='_self']"
	    System.out.println("Frame 2 Found ");
	    Thread.sleep(5000);
	    //Click on Here's another example //<a target="_self" href="monkeyspaw.htm"><font color="#0000ff"><b>Here's another</b> <b> example </b></font></a>
	    //xapath tried : b[contains(text()[2],'Here's another')]   
	    
	    driver.findElement(By.xpath("//a[@href='monkeyspaw.htm']")).click();
	    System.out.println("Title of Page is: " + driver.getTitle());
		
		
	}
	
	
	
	

}
