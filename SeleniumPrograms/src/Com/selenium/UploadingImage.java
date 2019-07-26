package Com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingImage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		String baseURL = "http://demo.guru99.com/test/upload/";
		
		driver.get(baseURL);
		
		Thread.sleep(2000);
		
		WebElement UploadElement = driver.findElement(By.id("uploadfile_0"));
		
		UploadElement.sendKeys("E:\\Shilpa\\images\\329832.jpg");
		
		driver.findElement(By.id("terms")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("submitbutton")).click();
		
		System.out.println("success");
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		

	}

}
