package selenium.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		WebElement t=driver.findElement(By.id("fname"));
		t.sendKeys("shilpa");
		driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();;
		
	
	}
}
