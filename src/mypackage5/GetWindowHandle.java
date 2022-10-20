package mypackage5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		// getWindowHandle()
//		String windowID=driver.getWindowHandle(); 
//		System.out.println(windowID); 
		
	    driver.findElement(By.xpath("//a[@id='non-users-notice-link']")).click();
		
		// getWindowHandles()
		
		Set<String> windowIDs=driver.getWindowHandles(); 
		
		// First method - iterator()
		
//		Iterator<String> it=windowIDs.iterator();
//		String parentWindowID=it.next();
//		String childWindowID=it.next();
//		System.out.println("Parent window ID: "+parentWindowID);
//		System.out.println("Child window ID:"+childWindowID);
		
		
		// Second Method - using List/ArrayList
		List<String> windowIDsList=new ArrayList(windowIDs);
//		
//		String parentWindowID= windowIDsList.get(0); 
//		String childWindowID= windowIDsList.get(1); 
//		
//		System.out.println("Parent window ID: "+parentWindowID);
//		System.out.println("Child window ID: "+childWindowID);
//		
//		driver.switchTo().window(parentWindowID);
//		System.out.println("Parent window title: "+ driver.getTitle());
//		
//		driver.switchTo().window(childWindowID); 
//		System.out.println("Child window title: "+ driver.getTitle());
		
		// For each loop
		for(String winid:windowIDsList)
		{
		
		String title=driver.switchTo().window(winid).getTitle();
		System.out.println(title);
		}
		
		driver.quit();
	
	}

}
