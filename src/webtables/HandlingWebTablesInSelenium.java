package webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class HandlingWebTablesInSelenium {  //print Whole Table
WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Accept Cookies
		//driver.findElement(By.xpath("//button[@class=' css-1hy2vtq'][2]")).click();
		
	}
	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	///seleniumscripts-161031144953.pdf  example taken from here
	
	@Test
	public void WebTables()
	{
		//driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click(); //  //a[text()='Sortable Data Tables']
		WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));//table[@id='table1']
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Rows: "+ rows.size());
		
		for (WebElement row: rows)
		{
			List<WebElement>  columns = row.findElements(By.tagName("td"));
			
			for (WebElement col : columns)
			{
				System.out.print(col.getText()+ "\td");
			}
			System.out.println();
		}
		
		
		WebElement table2 = driver.findElement(By.xpath("//table[@id='table2']"));
		List<WebElement> row1 = table2.findElements(By.tagName("tr"));
		
		for(WebElement rw : row1)
		{
			List<WebElement> colss = rw.findElements(By.tagName("td"));
			for(WebElement cl: colss)
			{
				System.out.print(cl.getText()+ "\t");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	

}
