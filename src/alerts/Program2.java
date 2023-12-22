package alerts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		JavascriptExecutor j =(JavascriptExecutor) driver;
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("See a sample prompt")));
		WebElement w1= driver.findElement(By.linkText("See a sample prompt"));	
	

		j.executeScript("arguments[0].click()", w1);
		
		//driver.findElement(By.partialLinkText("See a sample prom")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("prompt");
		Thread.sleep(1000);
		a.accept();
		driver.close();
	}

}
