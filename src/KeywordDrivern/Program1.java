package KeywordDrivern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Program1 {
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\shash\\eclipse-workspace\\SeleniumAutomation\\src\\testdata\\data.properties");
	    p.load(f);
	    String browse = p.getProperty("browser");
	    System.out.println(browse);
	    String url = p.getProperty("url");
	    System.out.println(url);
	
	}

}
