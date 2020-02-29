package seleniumFirstProject;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.Select;  
import org.openqa.selenium.firefox.FirefoxOptions;
  
public class Second {  
  
    public static void main(String[] args) {  
          
    // System Property for Gecko Driver   
    System.setProperty("webdriver.gecko.driver","/Users/alanwest/Desktop/Selenium WebDriver/Drivers/geckodriver");  
    
    //Initialize Gecko Driver using Firefox Options
    FirefoxOptions options = new FirefoxOptions();
    options.setLegacy(true); 
    WebDriver driver = new FirefoxDriver(options);
          
         // Launch Website  
    driver.navigate().to("http://www.javatpoint.com/");  
          
        // Click on the Custom Search text box and send value  
    driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");  
          
        // Click on the Search button  
    driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();    
        }  
  
} 

