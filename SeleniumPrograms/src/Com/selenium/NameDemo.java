package Com.selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameDemo {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		/*
		 * List<WebElement> elements = driver.findElements(By.name("name"));
		 * System.out.println("Number of elements:" +elements.size());
		 * 
		 * for (int i=0; i<elements.size();i++){ System.out.println("Radio button text:"
		 * + elements.get(i).getAttribute("value")); }
		 */
	  }
	}