package mypackage5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		//1) select specific check box

//		driver.findElement(By.xpath("//input[@id='monday']")).click(); 

		//2) Select all the check boxes

		List<WebElement>checkboxes=driver.findElements (By.xpath("//input[@type='checkbox' and contains(@id,'day')]")); 
		System.out.println("Total No of check boxes: "+checkboxes.size());
		
		// using for loop
//		for(int i=0;i<checkboxes.size();i ++)
//		{
//		checkboxes.get(i).click();
//		}
		// using for..each loop
//		for(WebElement chbox:checkboxes)
//		{
//		chbox.click();
//		}
		
		// 3) select multiple check boxes by choice
		// Monday & Sunday
//		for(WebElement chbox:checkboxes)
//		{
//		    String checkboxname=chbox.getAttribute("id");
//		    if(checkboxname.equals("monday") || checkboxname.equals("sunday"))
//		{
//		    	chbox.click();
//		}
		// 4) Select Last 2 check boxes
		int totalcheckboxes=checkboxes.size();
//		
//		for(int i=totalcheckboxes-3;i<totalcheckboxes;i++)
//		{
//			checkboxes.get(i).click();
//		}
		// 5) Select First 3 check boxes
		for(int i=0;i<totalcheckboxes;i++)
		{
		if(i<3)
		{
			checkboxes.get(i).click();
		}
		

		}
	}
}

