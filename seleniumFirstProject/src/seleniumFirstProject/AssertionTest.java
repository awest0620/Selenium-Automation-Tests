package seleniumFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; 
import org.openqa.selenium.support.ui.Select;


public class AssertionTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/alanwest/Desktop/Selenium WebDriver/Drivers/chromedriver");  
		WebDriver driver = new ChromeDriver();  
		
		driver.navigate().to("https://www.google.com/"); 
		
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));  
		dropdown.selectByValue("7");  
		
	    Assert.assertEquals("7 Adult",driver.findElement(By.id("divpaxinfo")).getText());  
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());  

	}

	

}
