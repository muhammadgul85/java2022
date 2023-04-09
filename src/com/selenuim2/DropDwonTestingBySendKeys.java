package com.selenuim2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDwonTestingBySendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println("Title: " +driver.getTitle());
		
		//Select Books by sendkeys method
		WebElement books = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		books.sendKeys("Books");
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
