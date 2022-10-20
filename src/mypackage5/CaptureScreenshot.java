package mypackage5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	public void testBStackTakeScreenShot() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com");
		//Call take screenshot function
		this.takeSnapShot(driver, "c://test.png") ; 
	}
		
	

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile=new File(fileWithPath);
		
		
		FileUtils.copyFile(SrcFile, DestFile);
	
		

	}



	private static void FileUtils(File srcFile, File destFile) {
		// TODO Auto-generated method stub
		
	}

}
