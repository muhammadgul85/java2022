package com.selenuim2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println("Title: " +driver.getTitle());
		
		WebElement SearchMenu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		Select s1 = new Select (SearchMenu);
		s1.selectByIndex(5);
		
		Thread.sleep(5000);
		System.out.println("End of Program");
		driver.quit();
	}

}
