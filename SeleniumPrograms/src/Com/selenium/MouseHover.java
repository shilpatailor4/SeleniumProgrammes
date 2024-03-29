package Com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		driver.get("https://demoqa.com/menu/");
		System.out.println("Demo menu page is appear");
		
		//Instantiate Action Class        
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover 
     WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
     //Mouse hover menuOption 'Music'
     actions.moveToElement(menuOption).perform();
     System.out.println("Done Mouse hover on 'Music' from Menu");
     
     Thread.sleep(1500);
     
     //Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
     WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]")); 
     //Mouse hover menuOption 'Rock'
     actions.moveToElement(subMenuOption).perform();
     System.out.println("Done Mouse hover on 'Rock' from Menu");
     
     //Now , finally, it displays the desired menu list from which required option needs to be selected
     //Now Select 'Alternative' from sub menu which has got displayed on mouse hover of 'Rock'
     WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
     actions.moveToElement(selectMenuOption).click();
     //selectMenuOption.click();
     System.out.println("Selected 'Alternative' from Menu");
		Thread.sleep(10000);
		driver.close();
		

	}

}
