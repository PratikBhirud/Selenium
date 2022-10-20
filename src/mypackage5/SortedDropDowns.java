package mypackage5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		
		WebElement P=driver.findElement(By.id("details-button"));
		P.click();
		WebElement R=driver.findElement(By.id("proceed-link"));
		R.click();
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Live Posting']")).click(); 

		WebElement drpElement=driver.findElement(By.name("category_id")); 
		Select drpselect=new Select (drpElement);

		List<WebElement> options=drpselect.getOptions();


		ArrayList originallist=new ArrayList();
		ArrayList templist=new ArrayList();


		for (WebElement option: options)
		{
			originallist.add(option.getText()); 
			templist.add(option.getText());
		}


		System.out.println("Original list: "+originallist); 
		System.out.println("Temp list: "+templist);

		Collections.sort(templist);
		
		System.out.println("Original list: "+originallist); 
		System.out.println("Temp list After sorting: "+templist);
		

	}

}
