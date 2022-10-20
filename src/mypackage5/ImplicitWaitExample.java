package mypackage5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/"); driver.manage().window().maximize();

//		Implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("Selenium"); 
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		driver.findElement(By.xpath("//h3[text()='Selenium WebDriver']")).click();
		

	}

}
