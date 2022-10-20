package mypackage5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
//		selectChoiceValues(driver,"choice 1");
		selectChoiceValues(driver,"all");
	}	
		public static void selectChoiceValues(WebDriver driver,String... value)
		{

		List<WebElement> choiceList =driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));


		if(!value[0].equalsIgnoreCase("all"))
		{
			for (WebElement item:choiceList)
			{
				String text=item.getText();
				
				for (String val:value)
				{
					if(text.equals (val)) 
					{
						item.click(); 
						break;
					}
				}
			}
		}
		else
		{
			for(WebElement item:choiceList)
			{
				item.click();
			}
		}
	
    }
}



