package mypackage5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Today's Deals")).click();
//		driver.findElement(By.partialLinkText("Deals")).click();
		
		// How to capture all the links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
//		System.out.println("Number of links present:"+links.size());
		// Normal for loop.
//		for(int i=0;i<=links.size();i++)
//		{
//		System.out.println(links.get(i).getText());
//		System.out.println(links.get(1).getAttribute("href"));
//		}
		for(WebElement link:links)
		{ 
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}

	}

}
