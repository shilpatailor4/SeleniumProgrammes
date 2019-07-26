package Com.selenium;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.javatpoint.com");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("scrollBy(0,4500)");
	    
	    Thread.sleep(1000);
	    
	    //driver.switchTo().alert().dismiss();
	    
	    Thread.sleep(2000);
	    
	    driver.close();
		

	}

}
