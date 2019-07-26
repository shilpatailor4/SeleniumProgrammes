package Com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
		String alertMessage = "";
		
		driver.get("http://jsbin.com/usidix/1");
		
		
		Thread.sleep(1500);
		
		driver.findElement(By.cssSelector("body > input[type=button]")).click();
		
		Thread.sleep(2000);
		
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        
        Thread.sleep(2000);
        
        System.out.println(alertMessage);
        driver.getPageSource();
        driver.getCurrentUrl();
        driver.close();
	}

}
