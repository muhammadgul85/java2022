package javascript.executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptExecutorPractice1 {
	
	
	WebDriver driver; 
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
	
	@Test
	public void javaScriptExecutorTest()
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//j.executeScript("window.scrollBy(0,1000)");
		
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
