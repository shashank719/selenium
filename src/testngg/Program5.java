package testngg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Program5 {
	
	@Test(dataProvider = "getData")
	public void login(String uname ,String pass)
	{
		System.out.println("data provider for login ");
		System.out.println(uname +"  "+pass);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = new Object[3][2];
		data[0][0]="1STNAME";
		data[0][1]="1st pass";
		data[1][0]="2nd name";
		data[1][1]="2nd pass";
		data[2][0]="3rd name";
		data[2][1]="3rd pass";
		
		return data;
	}
}
