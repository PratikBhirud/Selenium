package mypackage5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		
		WebElement P=driver.findElement(By.id("details-button"));
		P.click();
		WebElement R=driver.findElement(By.id("proceed-link"));
		R.click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()= 'Live Posting']")).click();

	    WebElement searchBox=driver.findElement(By.id("autocomplete"));

	    searchBox.clear();

	    searchBox.sendKeys("Toronto");

	    String text;			
	
	    do
	    {
	    	searchBox.sendKeys(Keys.ARROW_DOWN); 
	    	Thread.sleep(3000);

	    	text=searchBox.getAttribute("value");

	    	if(text.equals("Toronto, OH, USA")) 
	    		{
	    		searchBox.sendKeys (Keys.ENTER); break;
	    		}

	    	Thread.sleep(3000);
	    	while(!text.isEmpty());

	
	    }while(!text.isEmpty());


	}

}
