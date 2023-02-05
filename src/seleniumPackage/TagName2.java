package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver browserObject;
    System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
    browserObject = new ChromeDriver();
    browserObject.get("https://www.itlearn360.com/");
    int count = 0;
    List<WebElement> allLinks =  browserObject.findElements(By.tagName("a"));
    
    		
   
	}

}
