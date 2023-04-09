package com.selenuim2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownCollectAndPrintAllElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//Elements within Dropdown
		List<WebElement> alllinks= dropdown.findElements(By.tagName("option"));
		System.out.println("Size of elements list: "+alllinks.size());
		
		int i =1; //to start numbering these items
		for(WebElement item : alllinks)
		{
			//System.out.println(item.getText());
			System.out.println(i + ". \t" + item.getText() );
			i++; //To add the numbers, if you don't use this i=1 will stay as 1, no addition
		}
		
		Thread.sleep(4000);
		System.out.println("End of Program");
		driver.quit();

	}

}
