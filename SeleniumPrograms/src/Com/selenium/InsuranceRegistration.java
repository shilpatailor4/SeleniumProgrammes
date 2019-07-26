package Com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InsuranceRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		
		driver.findElement(By.name("Register")).click();
		
		
		

	}

}
