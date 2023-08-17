package com.orangehrm.genriclib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	

		String propertyFilePath="C:\\Users\\Qspiders 1\\"
		+ "SeleniumWeekendBatch\\OrangeHRMProject\\TestData\\config.Properties";
		
		public Properties readPropertyData() throws Throwable {
			FileInputStream file=new FileInputStream(propertyFilePath);
			Properties pr=new Properties();
			pr.load(file);
			return pr;		
		}
		public String readExcelData(String sheetname,int row,int col) throws Throwable {
			String exceldataPath="C:\\Users\\Qspiders 1\\SeleniumWeekendBatch"
			+ "\\OrangeHRMProject\\TestData\\TestData.xls";
			FileInputStream file=new FileInputStream(exceldataPath);
			Workbook wr=WorkbookFactory.create(file);
			Sheet sh=wr.getSheet(sheetname);
			Row rh=sh.getRow(row);
			String data=rh.getCell(col).getStringCellValue();
			return data;
		}
		public void writeExcelData(String sheetname,int row,int col,String data
				) throws Throwable {
			String exceldataPath="C:\\Users\\Qspiders 1\\SeleniumWeekendBatch"
					+ "\\OrangeHRMProject\\TestData\\TestData.xls";
			FileInputStream file=new FileInputStream(exceldataPath);
			Workbook wr=WorkbookFactory.create(file);
			Sheet sh=wr.getSheet(sheetname);
			Row rh=sh.getRow(row);
			Cell ce=rh.createCell(col);
			ce.setCellValue(data);
			FileOutputStream out=new FileOutputStream(exceldataPath);
			wr.write(out);
			wr.close();	
		}

	}



