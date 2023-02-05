package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
        WebDriver browserObject = new ChromeDriver();
        browserObject.get("https://admin-demo.nopcommerce.com/login");
        WebElement email=browserObject.findElement(By.id("Email"));
        email.clear();
        WebElement password=browserObject.findElement(By.id("Password"));
        password.clear();
        email.sendKeys("admin@yourstore.com");
        password.sendKeys("admin");
        WebElement button=browserObject.findElement(By.className("button-1"));
        button.submit();
    	browserObject.close();
	}

}
