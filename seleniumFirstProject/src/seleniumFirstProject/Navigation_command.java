package seleniumFirstProject;

import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;    
//import org.openqa.selenium.firefox.FirefoxDriver;    
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_command {

	public static void main(String[] args) {
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "/Users/alanwest/Desktop/Selenium WebDriver/Drivers/chromedriver");  
          
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
               
        // Launch Website    
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");     
  
        //Click on the Link Text using click() command    
        driver.findElement(By.linkText("This is a Link")).click();  
  
        //Go back to Home Page  
        driver.navigate().back();   
  
        //Go forward to Registration page  
        driver.navigate().forward();  
  
        // Go back to Home page  
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
  
        //Refresh browser  
        driver.navigate().refresh();  
        
        //Closing browser  
        driver.close();   

	}

}
