package selenium.broken.links;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokerLink1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\newchromedriver102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement getToKnow = driver.findElement(By.xpath("//div[text()='Get to Know Us']/parent::div"));
		
		//find all links in this Element
		List<WebElement> alllinks = getToKnow.findElements(By.tagName("a"));
		//System.out.println("Size is" + alllinks.size());
		
		for (int i=0; i<alllinks.size(); i++)
		{
			String url = alllinks.get(i).getAttribute("href");
			//We will create object of URL Class present in java.net.URL
			URL links = new URL(url);//open collection method of URL Class will be used
			
			//there is class URLConnection which we are converting to HttpURLconnection, casting
			//For example if you 've ChromeDriver imported and you want to use parent Classess you will have to type cast
			/*we need to get the response code and check response code, HttpURLConnection
			 using response we will see if each link working or not e.g. response code <400 it works
			 This loop only be called headless as 
			HttpURLConnection class is interdependant on URL Class to create object of it*/
			
			HttpURLConnection httpcon = (HttpURLConnection) links.openConnection();
			
			//There is method of HttpURLConnection called connect(); Opens a communications link to the resource referenced by thisURL, if such a connection has not already been established. 
			
			httpcon.connect();
			int respCode = httpcon.getResponseCode();//once connected we will get response code (int type)
			 
			if(respCode>=400)
			{
				System.out.println(url + " is invalid/broken link " +respCode);
			}
			else
			{
				System.out.println(url + respCode+ " is a valid link "+respCode);
			}
		}
				

		System.out.println("End of Program");
		driver.quit();
	}

}
