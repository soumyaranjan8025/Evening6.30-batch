package Com.dec6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_method {

	public static void main(String[] args, String url)throws Throwable {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String extText="gmail";
		//get text
		String ActText =driver.findElement(By.partialLinkText("Gm")).getText();
		if(ActText.equalsIgnoreCase(extText));
		{
		System.out.println("Link Text is matching::"+ActText+ "ExtText");
		}
		
		{
		System.out.println("Link test is not matching::"+ActText+ "ExtTest");
		}
		
Thread.sleep(5000);
driver.quit();
	}

}
