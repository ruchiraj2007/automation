package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	        WebDriver browserObject = new ChromeDriver();
	        browserObject.get("https://www.amazon.com/");
	        browserObject.close();
	}

}
