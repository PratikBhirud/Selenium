package mypackage5;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
