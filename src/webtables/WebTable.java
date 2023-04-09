package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable {  //print one column and rows in between that one column
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
	/*/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	 * /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	 * //table/tbody/tr[   remove 1 and take common and create string
	 *   //]/td[1]/a
	 */
	@Test
	public void WebTables()
	{
		String part1 = "//table/tbody/tr[";
		String part2 = "]/td[1]/a";   ////]/td[1]/a";            
		
		for (int i=1; i<=36;i++) //we picked 36 from the table by inspecting rows
		{
			System.out.println(driver.findElement(By.xpath(part1+i+part2)).getText());
			
		}
		
	}
	
	
	
	
	

}
