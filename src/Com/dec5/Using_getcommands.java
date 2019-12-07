package Com.dec5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getcommands {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	//print title of the page and length of the title
		String Strtitle=driver.getTitle();
		System.out.println("page title::strtitle");
		System.out.println("page title length::strtitle");
	//print url of the page and length of the url
		driver.getCurrentUrl();
		System.out.println("page url::strurl");
		System.out.println("page url length::strurl");
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
