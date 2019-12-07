package Com.dec6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_url {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://www.primusbank.qedgetech.com/");
driver. manage().window().maximize();
String strurl="https://;";
String currenturl=driver.getCurrentUrl();
if((currenturl.startsWith(strurl)));
{
	String strur1 = null;
	System.out.println("url is secured::"+strur1+ "+currenturl");
	
}
{
	System.err.println("url is not secured::"+currenturl+ "+currenturl");
}
Thread.sleep(5000);
driver.quit();
	



	}

	private static String currenturl() {
		// TODO Auto-generated method stub
		return null;
	}

}
