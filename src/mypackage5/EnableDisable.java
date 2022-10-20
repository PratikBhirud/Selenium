package mypackage5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://courses.letskodeit.com/practice");
		
		WebElement DisableButton=driver.findElement(By.id("disabled-button"));
		DisableButton.click();
		
		WebElement Textbox=driver.findElement(By.id("enabled-example-input"));
		
		boolean IsTextBoxEnabled=Textbox.isEnabled();
		if(IsTextBoxEnabled==false)
		{
			System.out.println("Textbox got disabled..Disable button works fine...PASSED");
		}	
		else
		{
			System.out.println("Textbox did not get disabled..Disable button does not work fine...FAILED");
		}	
		
		WebElement EnableButton=driver.findElement(By.id("enabled-button"));
		EnableButton.click();
		
		IsTextBoxEnabled=Textbox.isEnabled();
		
		if(IsTextBoxEnabled==true)
		{
			System.out.println("Textbox got enabled..Enable button works fine...PASSED");
		}	
		else
		{
			System.out.println("Textbox did not get enabled..Enable button does not work fine...FAILED");
		}

	}

}
