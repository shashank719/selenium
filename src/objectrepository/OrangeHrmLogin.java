package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 // page object model
public class OrangeHrmLogin {
	WebDriver driver ;
	  public OrangeHrmLogin(WebDriver driver) {
	
		this.driver = driver;
	}
	By username=By.xpath("//input[@name='username']");
     By password=By.xpath("//input[@name='passowrd']");
     By button =By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
     
    
     public WebElement emailId()
     {
    	 
    	 return driver.findElement(username);
     }
     public WebElement password()
     {
    	 return driver.findElement(password);
     }
     public WebElement button()
     {
    	 return driver.findElement(button);
     }
	
	

}
