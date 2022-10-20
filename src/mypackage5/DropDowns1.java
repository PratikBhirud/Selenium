package mypackage5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpCountryEle=driver.findElement(By.id("input-country"));
		Select drpCountry=new Select(drpCountryEle);
//		drpCountry.selectByVisibleText("Denmark");
//
//		drpCountry.selectByValue("10");  
//		drpCountry.selectByIndex (13);

		//selecting option from dropdown without using methods
		List<WebElement>alloptions=drpCountry.getOptions();

		for (WebElement option:alloptions)
		{	

		if(option.getText().equals("Cuba"))
		{
		option.click(); 
		break;
		}
		
	}

	}
}
