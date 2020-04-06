package seleniumFirstProject;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rocheNavifyAutomationTest {
	
	static WebDriver driver;

	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/alanwest/Desktop/Selenium WebDriver/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
	}
	
	public void closeBrowser() {
		driver.close();
	}


	public static void main(String[] args) {
		rocheNavifyAutomationTest obj = new rocheNavifyAutomationTest(); 
        obj.launchBrowser();
        obj.closeBrowser();
        
        

	}

}
