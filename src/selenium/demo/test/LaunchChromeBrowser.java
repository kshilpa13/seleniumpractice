package selenium.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe" );
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//Navigation commands
		driver.navigate().to("https://www.gmail.com/");
		System.out.println("navigating to gmail"+driver.getTitle());
		driver.navigate().back();
		System.out.println("back to google"+driver.getTitle());
		driver.navigate().forward();
		System.out.println("forward to gmail"+driver.getTitle());
		driver.navigate().refresh();
		System.out.println("refresh page"+driver.getTitle());
		//driver commands
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//webdriver commands
		driver.close();
		driver.quit();
		
	    
	
	
	}
}
