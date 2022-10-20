package mypackage5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		String year="2821";
		String month="July";
		String date="10";

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click(); //opens the date picker

		while(true)
		{
			String monthyear =driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[]=monthyear.split(" ");
			
			String mon=arr[0];
			
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))

				break;
			else
				driver.findElement(By.xpath("//button[normalize-space()->'1")).click();
//			1)Date selection

			List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));

			for (WebElement ele:alldates)

			{

			String dt=ele.getText();

			if(dt.equals(date))

			{

			ele.click();

			break;

		}
		

	}

}
}
}