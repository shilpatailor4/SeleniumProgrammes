package Com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Shilpa");
		driver.findElement(By.name("lastName")).sendKeys("Tailor");
		driver.findElement(By.name("phone")).sendKeys("8989898989");
		driver.findElement(By.name("userName")).sendKeys("shilpa@mailinator.com");
		driver.findElement(By.name("address1")).sendKeys("Vaishali");
		driver.findElement(By.name("city")).sendKeys("jaipur");
		driver.findElement(By.name("state")).sendKeys("Raj");
		driver.findElement(By.name("state")).sendKeys("302021");
		
		//Dropdown value select
		Select dropCountry = new Select(driver.findElement(By.name("country")));
		dropCountry.selectByVisibleText("AMERICAN SAMOA");
		System.out.println("dropdown value select AMERICAN SAMOA");
		
		driver.findElement(By.name("email")).sendKeys("shilpa@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		
		Thread.sleep(1500);
		
		//Submit form button
		driver.findElement(By.name("submit")).click();
		
		System.out.println("Successfully registered!");
		System.out.println("Title of the page is:" + " " +driver.getTitle());
		
		Thread.sleep(2500);   
		
		
		/*
		 * //Link Text and Partial Link Text use and inside and outside tag
		 * 
		 * String baseURL = "http://demo.guru99.com/test/block.html";
		 * 
		 * driver.get(baseURL);
		 * 
		 * driver.findElement(By.partialLinkText("Inside")).click();
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.navigate().back(); driver.navigate().refresh();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.partialLinkText("Outside")).click();
		 * System.out.println(driver.getTitle());
		 */
		
		
		
		
		driver.close();

	}

}
