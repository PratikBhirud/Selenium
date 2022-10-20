package mypackage5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://courses.letskodeit.com/practice");
		
	WebElement Dropdown=driver.findElement(By.id("carselect"));	
	Select Se=new Select(Dropdown);
	WebElement DefaultSelectedOption=Se.getFirstSelectedOption();
	String DefaultSelectedOptionText=DefaultSelectedOption.getText();
	if(DefaultSelectedOptionText.equals("BMW"))
	System.out.println("Correct default option is selected...PASSED");
	else
	System.out.println("InCorrect default option is selected...FAILED");
			
	Se.selectByIndex(1);
		Thread.sleep(3000);
		DefaultSelectedOption=Se.getFirstSelectedOption();
		String SelectedOption=DefaultSelectedOption.getText();
		if(SelectedOption.equals("Benz"))
		{
			System.out.println("Correct option got selected..PASSED");
		}	
		else
		{
			System.out.println("InCorrect option got selected..FAILED");
		}	
		//Following statement will select option based on value attribute
		Se.selectByValue("honda");
		Thread.sleep(3000);
		DefaultSelectedOption=Se.getFirstSelectedOption();
		SelectedOption=DefaultSelectedOption.getText();
		if(SelectedOption.equals("Honda"))
		{
			System.out.println("Correct option got selected after selecting it using ByValue..PASSED");
		}	
		else
		{
			System.out.println("InCorrect option got selected after selecting it using ByValue..FAILED");
		}	
		
		Se.selectByVisibleText("BMW");
		Thread.sleep(3000);
		DefaultSelectedOption=Se.getFirstSelectedOption();
		SelectedOption=DefaultSelectedOption.getText();
		if(SelectedOption.equals("BMW"))
		{
			System.out.println("Correct option got selected after selecting it using ByVisibleText..PASSED");
		}	
		else
		{
			System.out.println("InCorrect option got selected after selecting it using ByVisibleText..FAILED");
		}	
		
		List<String>ExpectedCarNames=new ArrayList<String>();
		ExpectedCarNames.add("BMW");
		ExpectedCarNames.add("Benz");
		ExpectedCarNames.add("Honda");
		
		List<WebElement>AllOptions=Se.getOptions();
		for(WebElement Option:AllOptions)
		{
			String OptionTxt=Option.getText();
			if(ExpectedCarNames.contains(OptionTxt))
			{
				System.out.println("Correct option is present..PASSED");
			}	
			else
			{
				System.out.println("Correct option is NOT present..FAILED");
			}	
		}	
	}
		

	}


