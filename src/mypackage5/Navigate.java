package mypackage5;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.get("https://www.flipkart.com/");  
        driver.navigate().back();             
        driver.navigate().forward();   
        driver.navigate().refresh();  
        driver.close(); 

	}

}
