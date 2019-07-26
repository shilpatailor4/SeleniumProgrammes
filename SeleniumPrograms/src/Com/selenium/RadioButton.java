package Com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///E:/Shilpa/Selenium/HTML/radio.html");
		
		int a = driver.findElements(By.xpath("//input [@name='group1']")).size();
		
		System.out.println("The button size is:" + "" +a);
		
		Thread.sleep(1500);
		
		for(int i=1; i<=a; i++) {
			
			driver.findElements(By.xpath("//input [@name='group1']")).get(1).click();
			
		}
		
		System.out.println("The selected value is: Watermallen");
		Thread.sleep(1500);
		
		
		driver.close();

	}

}
