package ACTIONS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {
	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		driver.findElement(By.linkText("Learn more about Gmail Terms of Use")).click();
		System.out.println(driver.getTitle());
		Set<String>  s =driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String parentwindow =i.next();
		String childwindow=i.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
	}

}
