package seleniumFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstTest {
WebDriver driver;

public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "/Users/alanwest/Desktop/Selenium WebDriver/Drivers/chromedriver");
	driver = new ChromeDriver();
	driver.get("http://www.google.com/");
	
}
	public static void main(String[] args) {
		SeleniumFirstTest obj = new SeleniumFirstTest(); 
        obj.launchBrowser();
	}

}
