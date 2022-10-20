package mypackage5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com");
		

		
		WebElement UserNameField=driver.findElement(By.name("username"));
		UserNameField.sendKeys("Admin");
		
		WebElement PasswordField=driver.findElement(By.name("password"));
		PasswordField.sendKeys("admin123");
		WebElement LoginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		LoginButton.click();

	}

}
