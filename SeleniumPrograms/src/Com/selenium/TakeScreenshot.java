package Com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		//Get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Validations in title
		
		if(title.equals("Google")) {
			
			System.out.println("Correct title");
		}else {
			
			System.out.println("Incorrect title");
		}
		
		//Takes Screenshot 
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Copy the screenhot as desired location
		//FileUtils.copyFile(src, new File("E:\\Shilpa\\Selenium\\workspace\\Screenshots\\google.png"));
		FileUtils.copyFile(src1, new File("/E:\\\\Shilpa\\\\Selenium\\\\workspace\\\\Screenshots\\\\google.png"));
		
		driver.close();
		
		
		

	}

}
