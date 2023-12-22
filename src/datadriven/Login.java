package datadriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args)  throws IOException, EncryptedDocumentException, InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		DataDrivenFiLES d = new DataDrivenFiLES();
		
		String username =d.readData("C:\\Users\\shash\\OneDrive\\Documents\\Testdata1.xlsx", "data1", 1,0);
		String pwd = d.readData("C:\\Users\\shash\\OneDrive\\Documents\\Testdata1.xlsx", "data1", 1, 1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(username);
		driver.findElement(By.xpath("//button[@type='submit']"));
	}

}
