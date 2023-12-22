package screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("denyBtn")).click();
		WebElement we = driver.findElement(By.className("video-iframe"));
		driver.switchTo().frame(we);
		driver.findElement(By.className("ytp-share-title")).click();

		
		//driver.manage().deleteCookieNamed("qwerty");
		
	}

}
