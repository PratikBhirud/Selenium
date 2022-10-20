package mypackage5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		 driver.manage().window().maximize();
		 driver.switchTo().frame("iframeResult"); 
		 driver.switchTo().frame(0); 

		System.out.println("Text present inside the inner frame:"+ driver.findElement(By.xpath("//h1")).getText());
	

	}

}
