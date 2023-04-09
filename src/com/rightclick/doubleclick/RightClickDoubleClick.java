package com.rightclick.doubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		/* You don't create var for one time element
		WebElement hotelImage = driver.findElement(By.xpath("//img[@alt='Hotel Image 3']"));
		action.contextClick(hotelImage).perform();
		*/
		
		action.contextClick(driver.findElement(By.xpath("//img[@alt='Hotel Image 3']"))).perform();
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
