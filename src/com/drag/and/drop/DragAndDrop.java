package com.drag.and.drop;
//Drag and Drop - iFrame Concept



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//iFrame where these two items located so we will use switch to frame 
		driver.switchTo().frame(0); // in Dom search for iFrame and see how many frames
		Actions action = new Actions(driver);
		WebElement sourceitem = driver.findElement(By.xpath("//div[@id='draggable']"));

		
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDrop(sourceitem, destination).perform();
		
		Thread.sleep(3000);
		System.out.println("End of Test");
		
		driver.quit();
	}

}
