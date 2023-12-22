package KeywordDrivern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class KeyDrivenFiles {
	
	// class having methods of diff fucntionality
	
	public String readData(String excelPath,String sheetname,int rowcount, int cellcount) throws IOException, EncryptedDocumentException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row r = sh.getRow(rowcount);
		Cell cell = r.getCell(cellcount);
		String data= cell.getStringCellValue();
		return data;
		
	}
	public int rowCount(String exclpath, String sheetname) throws IOException , EncryptedDocumentException
	{
		FileInputStream fis = new FileInputStream(exclpath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int rc= sh.getLastRowNum();
		return rc;
		
	}
	public void writeData(String exclpath,String sheetname,int rowcount,int cellcount,String data)  throws IOException , EncryptedDocumentException
	{
		FileInputStream fis = new FileInputStream(exclpath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row =sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(exclpath);
		wb.write(fos);
		fos.flush();
	}
	// resuable genric method to read property file 
	public String readProperty(String proppath,String key) throws IOException
	{
		FileInputStream f = new FileInputStream(proppath);
		Properties p = new Properties();
		p.load(f);
		String value = p.getProperty(key);
		return value;
	}


}
