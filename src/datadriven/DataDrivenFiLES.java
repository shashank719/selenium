package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenFiLES {
	
	public String readData(String exclpath,String sheetname,int rowcount,int cellcount) throws InterruptedException, IOException, EncryptedDocumentException
	{
		FileInputStream fis = new FileInputStream(exclpath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row =sh.getRow(rowcount);
		Cell cell = row.getCell(rowcount);
		String data = cell.getStringCellValue();
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

}
