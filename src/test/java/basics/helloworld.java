package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./selenium drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.xpath("//*[@id='gb_70']")).click();
		driver.findElement(By.xpath("//*[@id='hplogo']/canvas")).click();         
		












	}

}
