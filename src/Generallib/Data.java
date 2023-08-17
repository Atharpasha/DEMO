package Generallib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {
	
	public Properties readPropertyData() throws Throwable
	{
		File path=new File("C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\TestData\\king.properties");
	    FileInputStream file=new FileInputStream(path);
	    Properties pr=new Properties();
	    pr.load(file);
	    return pr;
	    
		
	}
	public String excelDataRead(String sheetname,int rindex,int cindex) throws Throwable
	{
		File path=new File("C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\TestData\\data.xlsx");
		FileInputStream file=new FileInputStream(path);
		Workbook wr=WorkbookFactory.create(file);
		Sheet sheet=wr.getSheet(sheetname);
		Row row=sheet.getRow(rindex);
		Cell cell=row.getCell(cindex);
		String values=cell.getStringCellValue();
		return values;	
	}

}
