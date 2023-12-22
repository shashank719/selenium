package testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program {
	
	@Test(groups= {"smoke"})
	public void m1()
	{
		System.out.println("hello");
	
	}
	@Test(groups= {"smoke"})
	public void m2()
	{
		System.out.println("hey");
	}

}
