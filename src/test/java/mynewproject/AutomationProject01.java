package mynewproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationProject01 {

	public static void main(String[] args)  throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
		// TODO Auto-generated method stub
	System.out.println("Successfully opened the sports website http://www.espncricinfo.com");
    
	Thread.sleep(6000);
	
	driver.quit();
  }
}

