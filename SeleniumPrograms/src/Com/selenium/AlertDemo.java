package Com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseURL = "http://demo.guru99.com/test/delete_customer.php";
		
		driver.get(baseURL);
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertmessage = driver.switchTo().alert().getText();
		
		System.out.println("alertmessage");
		
		Thread.sleep(4000);
		
		alert.accept();
		
		driver.close();
		

	}

}
