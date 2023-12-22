package javascriptexcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.selenium.dev");
	driver.manage().window().maximize();
	WebElement w = driver.findElement(By.xpath("//h2[@class='selenium']"));
	Point p = w.getLocation();
	int xaxis = p.getX();
	int yaxis= p.getY();
	System.out.println(xaxis);
	System.out.println(yaxis);
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("window.scrollBy("+xaxis+" , "+(yaxis)+")");
	driver.close();
	
	
}
}
