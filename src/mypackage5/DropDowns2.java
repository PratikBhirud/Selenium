package mypackage5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.bing.com/?toWww=1&redig=C6419C47EE284AAF8AA393B068128460");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("sb_form_q")).sendKeys("selenium");

	    List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));

	    System.out.println("Size of Auto suggestions:"+list.size());
	    
	    for(WebElement listitem:list)
	    {
	    	if(listitem.getText().contains("download"))
	    	{
	    	break;
	    	}
	    	listitem.click();
	    	break;
    	}
	    }

	}


