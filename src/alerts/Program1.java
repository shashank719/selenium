package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		driver.findElement(By.linkText("See an example alert")).click();

		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(a.getText());
		// provides info of alert
		// a.accept(); // it accecpt the alert
		a.dismiss(); // it dissmiss the alert

	}

}
