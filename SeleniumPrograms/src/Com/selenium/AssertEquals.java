package Com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssertEquals {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		Assert.assertNotEquals("1 Adult", driver.findElement(By.id("divpaxinfo")));
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(1500);

		driver.close();
	}

}
