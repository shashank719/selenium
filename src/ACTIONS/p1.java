package ACTIONS;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.switchTo().frame(0);
		
		
		
		driver.findElement(By.id("denyBtn")).click();
		WebElement we = driver.findElement(By.xpath("//span[normalize-space()='RecentlyViewed']"));
		Actions a = new Actions(driver);
		a.contextClick(we).perform();
	}

}
