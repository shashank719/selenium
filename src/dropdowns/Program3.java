package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/inventory.html");
	WebElement element = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	driver.manage().window().maximize();
	
	Select s = new Select(element);
	s.selectByIndex(2);
	Thread.sleep(2000);
	s.selectByValue("hilo");
	Thread.sleep(2000);
	s.selectByVisibleText("Name (A to Z)");
	driver.close();
	}

}
