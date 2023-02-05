package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
	      WebElement checkboxBike = browserObject.findElement(By.xpath("//input[@value='Bike']"));
	      WebElement checkboxHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
	      WebElement submitButton = browserObject.findElement(By.xpath("//input[@value='Send']"));
	     // 9. Perform click on boat button 
	      checkboxBoat.click();
	      // 10. Perform click on bike button
	      checkboxBike.click();
	      // 11. Perform click on horse button 
	      checkboxHorse.click();
	      System.out.println("wait 3 seconds and submit and close");
	      // 12. Perform click on send button
	      submitButton.click();
		
	      // 13. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	      Thread.sleep(3000);
	      // 14. Close the web browser
	      browserObject.close();
	}

}
