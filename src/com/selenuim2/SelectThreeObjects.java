package com.selenuim2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectThreeObjects {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Title: " +driver.getTitle());
		////  //a[@id='u_0_2_SD'] These keep changing 
		Thread.sleep(5000);
		WebElement CreateAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", CreateAccount);
		//CreateAccount.click();
		System.out.println("Create Account URL: " + driver.getCurrentUrl());
		Thread.sleep(4000);
		//WebElement CookiesAccept = driver.findElement(By.xpath("//button[@id='u_0_l_op']"));
		//CookiesAccept.click();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		//Select Day by visible text
		Select selectDay = new Select(day);
		selectDay.selectByVisibleText("10");
		
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		//Select month by index
		Select selectMonth = new Select (Month);
		
		selectMonth.selectByIndex(4);
		
		//Select year by value
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select selectYear = new Select (year);
		selectYear.selectByValue("1999");
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(5000);
		
		System.out.println("End of Program");
		driver.quit();

	}

}
