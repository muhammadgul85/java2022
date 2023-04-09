package com.selenuim2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//Pop up handle
		driver.findElement(By.xpath("(//a[text()='Allow'])[1]")).click();
		Thread.sleep(4000);
		
		//Handle Alert , Alert is interface
		Alert a = driver.switchTo().alert();
		a.dismiss();	
		
		//use build() for integrating more than one action
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Loans']")))
		.moveToElement(driver.findElement(By.xpath("//label[text()='Agri and Rural Finance']")))
		.moveToElement(driver.findElement(By.xpath("alt=\"Tractor Loan"))).click().build().perform();
		
		

	}

}
