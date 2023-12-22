package testngg;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Program7 {
	@Test(priority = 3)
     public void login3()
	
	{
		//org.testng.Assert.fail();
		Reporter.log("LOGIN PASS3", true);
	}
	
	
	@Test(description = "PERFORM LOGIN OPERATION",priority = 2)
	public void login2()
	
	{
		//org.testng.Assert.fail();
		Reporter.log("LOGIN PASS2", true);
	}
	@Test(priority = 1)
	public void login1()
	
	{
		//org.testng.Assert.fail();
		Reporter.log("LOGIN PASS1", true);
	}


}
