package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLogin {
   WebDriver driver;

public FaceBookLogin(WebDriver driver) {
	this.driver = driver;
}
By  emailid = By.xpath("//input[@id='email']");
By  password =By.xpath("//input[@id='pass']");
By button = By.xpath("//button[@name='login']");
public WebElement emailID()
{
    return driver.findElement(emailid);
}
public WebElement paswoord()
{
	return driver.findElement(password);
}
public WebElement button()
{
	return driver.findElement(button);
}
   

}
