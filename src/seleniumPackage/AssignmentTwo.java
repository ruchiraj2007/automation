package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    WebDriver  browserObject = new ChromeDriver();
        browserObject.get("https://www.itlearn360.com/");
        browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        WebElement Login = browserObject.findElement(By.id("loginlabel"));
        Login.click();
        browserObject.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("ruchiraj");
        browserObject.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Lovetesting21%");
        WebElement SubmitLogin = browserObject.findElement(By.xpath("//*[@id=\"wp-submit\"]"));
        SubmitLogin.click();
        browserObject.findElement(By.xpath("//*[@id=\"search_course\"]")).sendKeys("Learn Node JS");
        WebElement button=browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button"));
        button.click();   
        WebElement dashboard = browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a"));
        dashboard.click();
        WebElement offeredacademic = browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a"));
        offeredacademic.click();
        WebElement subscribenow = browserObject.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button"));
        subscribenow.click();
        WebElement radioButtonPayWithStripe = browserObject.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li/label"));
        radioButtonPayWithStripe.click();
        WebElement placeOrder = browserObject.findElement(By.xpath("//*[@id=\"learn-press-checkout-place-order\"]"));
        placeOrder.submit();
        WebElement cn = browserObject.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe"));
        browserObject.switchTo().frame(cn);
        browserObject.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).sendKeys("4242424242424242");
        browserObject.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[1]/span/span/input")).sendKeys("09/27");
        browserObject.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[2]/span/span/input")).sendKeys("222");
        browserObject.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[3]/span/span/input")).sendKeys("78240");
        WebElement payNow = browserObject.findElement(By.xpath("//*[@id=\"payment-button\"]"));
        payNow.submit();
       
	}

}
