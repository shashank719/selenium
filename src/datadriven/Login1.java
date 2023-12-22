package datadriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Login1 {
	public static void main(String[] args)  throws IOException, EncryptedDocumentException, InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		DataDrivenFiLES d = new DataDrivenFiLES();
		int rc = d.rowCount("C:\\\\Users\\\\shash\\\\OneDrive\\\\Documents\\\\Testdata1.xlsx", "data1");
		System.out.println(rc);
		
		for (int i = 1; i <= rc; i++) {
		
		
		String username =d.readData("C:\\Users\\shash\\OneDrive\\Documents\\Testdata1.xlsx", "data1", i,0);
		String pwd = d.readData("C:\\Users\\shash\\OneDrive\\Documents\\Testdata1.xlsx", "data1", i, 1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement wb = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", wb);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		
	
		}
		
	}

}
