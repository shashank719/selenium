package javascriptexcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement w = driver.findElement(By.id("email"));
		WebElement w1 = driver.findElement(By.xpath("//button[@name='login']"));
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.executeScript("document.getElementById('email').value='1234'");
		j.executeScript("arguments[0].value='1234'",w);
		j.executeScript("arguments[0].click()", w1);
		
		
				
	}

}
