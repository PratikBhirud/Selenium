package mypackage5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    
	    WebElement emailinputbox=driver.findElement(By.id("Email"));
	    emailinputbox.clear();
	    emailinputbox.sendKeys("admin@yourstore.com");
	    
	    System.out.println("Result from getAttribute() method: "+ emailinputbox.getAttribute("value"));
	    System.out.println("Result from getText() method: "+ emailinputbox.getText());

	    

	    WebElement button=driver.findElement(By.xpath("//button[normalize space()='Log in']"));

	    System.out.println(button.getAttribute("type")); 
	    System.out.println(button.getAttribute("class"));

	    System.out.println(button.getText());

	    String title=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText(); 
	    System.out.println(title);	    

	}

}
