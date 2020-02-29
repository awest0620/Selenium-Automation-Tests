package seleniumFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; 
import org.openqa.selenium.support.ui.Select;

public class BlurbTest {
	
	static WebDriver driver;

	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/alanwest/Desktop/Selenium WebDriver/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.blurb.com/");
		
	}
	
	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) {
		BlurbTest obj = new BlurbTest(); 
        obj.launchBrowser();
        
        driver.findElement(By.linkText("https://www.blurb.com/my/account/login")).click();
        driver.findElement(By.name("user[username]")).sendKeys("FakeName");
        driver.findElement(By.name("user[password]")).sendKeys("FakePassword");
        driver.findElement(By.className("btn btn--graycharcoal-to-white--lg")).click();
        
        
        // obj.closeBrowser();

	}

}
