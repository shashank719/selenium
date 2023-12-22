package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='BHO']")).click();
		driver.findElement(By.xpath("//div[text()='To']")).click();
		driver.findElement(By.xpath("(//div[text()='AMD'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	
	}

}
