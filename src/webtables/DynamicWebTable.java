package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicWebTable {  //print Whole Table
WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		
		//Accept Cookies
		driver.findElement(By.xpath("//button[@class=' css-1hy2vtq'][2]")).click();
		Thread.sleep(4000);
	}
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void WebTables()
	{
		WebElement table = driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']/tbody"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("size of rows: "+rows.size());
		
		
		for(WebElement row : rows)
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			
			for(WebElement col : cols)
			{
				System.out.print(col.getText()+ "\t");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	//http://the-internet.herokuapp.com/
	
	

}
