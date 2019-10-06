package selenium.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		WebElement partiallink=driver.findElement(By.partialLinkText("This"));
		partiallink.click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
	}
}
