package Qedge.com;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Browser {

	public static void main(String[] args) {
		// instance object for chrome drive
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.close();
		
		
		
	
	 
		

	}

}

