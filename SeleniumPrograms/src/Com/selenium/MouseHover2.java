package Com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		driver.get("http://demoqa.com/slider/");
		System.out.println("Demo page appears");
		
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(By.id("slider"));
		actions.moveToElement(target, 50, 0).perform();
		target.click();
		System.out.println("Moved slider in horizontal directions");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
