package dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program5 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home?ds_rl=1012408&gad_source=1&gclid=CjwKCAiAmZGrBhAnEiwAo9qHiVgtOGqPIV0U2iWAeo6E7DyKIFtjgAdgewps5KffRkTBS0lms1Z2shoCOtUQAvD_BwE&gclsrc=aw.ds#/book/bookflight");
	    driver.findElement(By.id("flightOrigin1")).clear();
	    WebElement w = driver.findElement(By.id("flightOrigin1"));
	    w.sendKeys("chicago");
	    Thread.sleep(2000);
	    w.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    w.sendKeys(Keys.ENTER);
	    WebElement w1 = driver.findElement(By.name("destination"));
	    w1.sendKeys("NADI");
	    w1.sendKeys(Keys.ARROW_DOWN);
	    w1.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.close();
	}

}
