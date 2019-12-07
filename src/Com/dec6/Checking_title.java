package Com.dec6;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_title {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		String Exptitle="google";
		String Actitle=driver.getTitle();
		//verify exptitle is equals to acttitle
		if(Exptitle.equals(Actitle));
		{
		System.out.println("Title is matching::"+Exptitle+ "Acttitle");
		}
		
		{
	System.out.println("Title is not matching::"+Exptitle+ "Acttitle");
}
         //suspend from execution for 4 second
          Thread.sleep(4000);
          driver.close();


		
		
		

	}
}


