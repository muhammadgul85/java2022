package screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot2 {
	WebDriver driver;//Change WebDriver to ChromeDriver and in @Test method you should be able to call it's method getscreenshot
	//once called the method switch this back to WebDriver
	
	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void screenShotTest() throws IOException
	{
        System.out.println(new Date());
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		//Replace : with - 
		date = date.replace(":", "-");
		
		System.out.println(date);
	
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		
		//Create Folder
		String folderPath = System.getProperty("user.dir")+ "\\Screenshots";
		File folder = new File(folderPath);
		folder.mkdir();
		
		File srcFile=	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//With WebDriver interface you get this
																	//as you 've to do upcasting
		//To use FileUtils Add jar for Apache Common (API) for screenshots in build path, normally you will use maven for dependency
		FileUtils.copyFile(srcFile, new File(folderPath+"\\adactin"+ date + ".png"));
		//If you re-run the above this will overwrite the previous screenshot, so what's the solution 
	
		
	}
}
