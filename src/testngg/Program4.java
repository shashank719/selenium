package testngg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program4 {
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
    
	
	@Parameters({"url"})
	@Test
	public void test(String urlname) {
		System.out.println("test script");
		System.out.println(urlname);
	}

	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("BEFORE METHOD");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("after METHOD");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}


	

}
