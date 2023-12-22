package ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src = driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		WebElement trg =driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, trg).build().perform();
		
	}

}
