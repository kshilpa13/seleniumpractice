package selenium.demo.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropandDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	//handle drop downs
	Select sel=new Select(driver.findElement(By.id("testingDropdown")));
	//sel.selectByVisibleText("Manual Testing");
	//sel.selectByValue("Database");
	sel.selectByIndex(1);
	WebElement ele=sel.getFirstSelectedOption();
	System.out.println(ele.getText());
	List<WebElement>list=sel.getOptions();
	for(WebElement e:list)
	{
		System.out.println(e.getText());
	}
}
}
