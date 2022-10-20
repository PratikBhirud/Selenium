package mypackage5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("q")).sendKeys("java tutorial");

	    List<WebElement>list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));

	    System.out.println("Size of Auto suggestions:"+list.size());
	    
	    for(WebElement listitem:list)
	    {
	    	if(listitem.getText().contains("pdf"))
	    	{
	    	break;
	    	}
	    	listitem.click();
	    	break;
	    }
	}	
}


