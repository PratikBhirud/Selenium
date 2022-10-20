package mypackage5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDown {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//Approach1
//		Select noOfEmpsdrp=new Select(driver.findElement(By.name("NoOfEmployees")));
//		noOfEmpsdrp.selectByVisibleText("16 20");
//
//		Select industryDrp=new Select(driver.findElement(By.name("Industry"))); 
//		industryDrp.selectByVisibleText("Travel");
//
//		Select countryDrp=new Select(driver.findElement(By.name("Country"))); 
//		countryDrp.selectByVisibleText("Aruba");
		
		//Approach1
		WebElement noOfEmpsEle=driver.findElement(By.name("NoOfEmployees")); 
		selectOptionFromDropDown (noOfEmpsEle, "16 - 20");

		WebElement industryEle=driver.findElement(By.name("Industry")); 
		selectOptionFromDropDown (industryEle, "Healthcare");

		WebElement country=driver.findElement(By.name("Country")); 
		selectOptionFromDropDown (country, "Ghana");
		}

		public static void selectOptionFromDropDown(WebElement ele,String value)
		{
		Select drp=new Select(ele);
		List<WebElement>alloptions=drp.getOptions();


		for (WebElement option:alloptions)


		if(option.getText().equals("Cuba"))
		{
		option.click();
		break;

	}

}
}
