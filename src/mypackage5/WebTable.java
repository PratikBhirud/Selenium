package mypackage5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium, dev/downloads/"); driver.manage().window().maximize();

//		1) How many rows in table

		int rows=driver.findElements (By.xpath("//table[@class='data-list']/tbody/tr")).size(); System.out.println("Total number of rows in a table: "+rows); //5

		//2) How many columns in a table

		int cols=driver.findElements (By.xpath("//table[@class='data-list']//thead/tr/th")).size(); System.out.println("Total number of columsn in a table: "+cols); //6

		//3) Retrieve the specific row/column data

		String value=driver.findElement(By.xpath("//table[@class='data-list']//tr[2]/td[1]")).getText(); System.out.println("The value is: "+value);

//		4) Retrieve all the data from the table

		System.out.println("Data from the table........"); 
		for (int r=1;r<=rows;r++) 

		{

		for(int c=1;c<=cols; c++)  {

		String data=driver.findElement(By.xpath("//table[@class='data-list']//tr["+r+"]/td["+c+"]")).getText(); 
				System.out.print(data+"   ");

		}

		System.out.println();



		}
		
//		5) Print Release Date, VersionNo of Java Language of selenium

		for(int r=1;r<=rows; r++)
		{	
			

		String language=driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[1]")).getText();

		if(language.equals("Java"))
		{
		String versionno=driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[2]")).getText(); 
		String releasedate=driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[3]")).getText(); 
		System.out.println(language+" "+ versionno+" "+releasedate);

		}

		driver.quit();
		

	}

	}
}
