package testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Laptop {
	
	@Test
	public void mac(){
         System.out.println("mac");		
	}
	@Test(dependsOnMethods = {"intel","mac"})
	public void amd()
	{
		System.out.println("amd");
	}
	@Test
	public void intel()
	{
		System.out.println("intel");
	}
	@Test
	public void m1()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		
		int i =1;//initiaization
		while(i<5)//condition
		{
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		i++;
		}
		for(int j =1;j< 3;j++)
		{
			driver.findElement(By.xpath("//*[@data-testid='Children-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		
	}
	
}
