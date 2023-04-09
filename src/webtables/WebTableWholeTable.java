package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableWholeTable {  //print Whole Table
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
	 *             /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[7]/a
	 *             
	 * //table/tbody/tr[   remove 1 and take common and create string
	 *   //]/td[
	 *   ]
	 */    //
	@Test
	public void WebTables()
	{
		String part1 = "//table/tbody/tr[";
		String part2 = "]/td[";   ////]/td[1]/a"; we have removed a as the tags are not assigned to each element in table
		String part3 = "]"; 
		
		for (int i=1; i<=36;i++) //we picked 36 from the table by inspecting rows
		{
			for(int j=1;j<=8 ; j++)
			{
				//System.out.println(driver.findElement(By.xpath(part1+i+part2+j+part3)).getText());
				System.out.print(driver.findElement(By.xpath(part1+i+part2+j+part3)).getText()+ "\t"); //we give tab space and print in one line
			}
			
			//After each row we want to take the cursor to the next line 
			System.out.println();
			
		}
		
	}
	
	
	
	
	

}
