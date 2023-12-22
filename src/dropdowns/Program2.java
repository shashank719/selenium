package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=google.com&utm_medium=organic");
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.id("how-select")));
		
		s.selectByIndex(2);
		Thread.sleep(2000L);
		
		s.selectByValue("Internet");
		Thread.sleep(2000l);
		s.selectByVisibleText("Event");
		Thread.sleep(2000l);
		driver.close();
		
	}

}
