package mypackage5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int brokenLinks=0;
		
		for(WebElement element:links)
		{
		String url=element.getAttribute("href");
		if(url == null || url.isEmpty())
		{
			System.out.println("URL is empty");
		    continue;
		}
		URL link = new URL(url);
		try {
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			httpconn.connect();
			if(httpconn.getResponseCode()>=400) 
			{
			System.out.println(httpconn.getResponseCode()+url+" is"+" Broken link");
			brokenLinks++;
			}
			else
			{
			System.out.println(httpconn.getResponseCode()+ url+" is" +" Valid Link");
			}
			
		
		} catch (Exception e) {
			

	}


}
	}
}
