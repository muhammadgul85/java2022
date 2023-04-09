package javascript.executor;
import org.openqa.selenium.JavascriptExecutor;
/**********************************
JavaScriptExecutor  in Selenium
*********************************


JavascriptExecutor(I)

executeScript(String, Object...);

String here means the JavaScript statements 

Object means WebElements 


to scroll the window in y-axis or vertically by 1000 pixels
below is the JavaScript command

window.scrollBy(0,1000)

to scroll the window in y-axis or vertically till bottom of page
below is the JavaScript command


window.scrollTo(0,document.body.scrollHeight)


*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
	WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test 
	public void javaScriptExecutorTest()
	{
		//write JavascriptExecutor js = driver and then right click on it to upcast it
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll to 1000 pixels down or y axis or vertically  JavascriptExecutor command,    window.scrollBy(0,1000)
	
		js.executeScript("window.scrollBy(0,1000)");
		
		// Scroll y axis vertically till bottom of page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	

}
