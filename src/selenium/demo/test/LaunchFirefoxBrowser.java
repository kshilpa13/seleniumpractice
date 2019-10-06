package selenium.demo.test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "F:/geckodriver/geckodriver.exe");
	        FirefoxOptions options = new FirefoxOptions();
	        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	        WebDriver driver =  new FirefoxDriver(options);
	       // driver.get("https://stackoverflow.com");
	        driver.get("https://www.google.com/");
	        System.out.println("Page Title is : "+driver.getTitle());
	        //driver.quit();
	    }
    }
	
