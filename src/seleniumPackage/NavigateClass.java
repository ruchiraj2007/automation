package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	      WebDriver  browserObject = new ChromeDriver();
          browserObject.get("https://www.facebook.com");
         System.out.println("this is " + browserObject.getTitle()+ " website");
         System.out.println("url is " + browserObject.getCurrentUrl());
         browserObject.navigate().to("https://www.instagram.com/");
         System.out.println("this is " + browserObject.getTitle()+ " website");
         System.out.println("Url is " + browserObject.getCurrentUrl());
         browserObject.navigate().to("https://www.twitter.com");
         System.out.println("this is " + browserObject.getTitle()+ " website");
         System.out.println("Url is " +browserObject.getCurrentUrl());
         browserObject.navigate().back();
         System.out.println("this is " + browserObject.getTitle()+ " website");
         System.out.println("Url is " +browserObject.getCurrentUrl());
         browserObject.navigate().forward();
         System.out.println("this is " + browserObject.getTitle()+ " website");
         System.out.println("Url is " +browserObject.getCurrentUrl());
         browserObject.close();
	}

}
