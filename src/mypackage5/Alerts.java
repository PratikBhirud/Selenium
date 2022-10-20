package mypackage5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// Alert window with OK button.
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		
		// Alert window with OK & Cancel button
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		driver.switchTo() . alert(). accept(); 
//		driver.switchTo().alert().dismiss();
		
		// Alert window with input box, capture text from alert
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alertwindow=driver.switchTo().alert();
		System.out.println("The message displayed on alert: "+alertwindow.getText());
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();
		
		

	}

}
