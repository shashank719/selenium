package testngg;

import org.testng.annotations.Test;
 // login page
public class Program1 {
	@Test
	public void login()
	{
		System.out.println("login ");
	}
	@Test(groups= {"smoke"})
	public void signup()
	{
             System.out.println("sign up");
	}
	@Test
	public void createacc()
	{
		System.out.println("create account");
	}


}
