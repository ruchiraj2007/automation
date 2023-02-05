package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
WebDriver browserObject = new ChromeDriver();
browserObject.get("https://google.com/");
browserObject.findElement(By.name("q")).sendKeys("Selenium python");
browserObject.findElement(By.name("btnK")).submit();
browserObject.close();
	}
}
