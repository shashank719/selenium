package testngg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program3 {
	@Test(enabled = false)
	public void paymentcard()
	{
		System.out.println("payment through card");
	}
	@Test(groups= {"smoke"})
	public void paymentcash()
	{
		System.out.println("payment through cash");
	}
	@Test(timeOut = 1000)
	public void paymentupi()
	{
		System.out.println("payment through upi");
	}
	
	@Test
	public void createacc()
	{
		System.out.println("create account");
	}

}
