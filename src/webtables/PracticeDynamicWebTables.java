package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeDynamicWebTables {
	
	WebDriver driver;
	
	@Test
	public void WebTablesTest()
	{
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		
		WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));
		List<WebElement> rows = table1.findElements(By.tagName("tr"));
		for(WebElement row : rows)
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(WebElement col : cols)
			{
				System.out.print(col.getText() + "\t");
				
			}
			System.out.println();
		}
		
		
		WebElement table2 = driver.findElement(By.xpath("//table[@id='table2']"));
		
        List<WebElement> rows2 =table2.findElements(By.tagName("tr"));
        for(WebElement row: rows2)
        {
        	List<WebElement> cols = row.findElements(By.tagName("td"));
        	for(WebElement col: cols)
        	{
        		System.out.print(col.getText() + "\t");
        	}
        	System.out.println();
        }
		
		
		
		
		
	}
	
	
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver= new ChromeDriver ();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}

}
