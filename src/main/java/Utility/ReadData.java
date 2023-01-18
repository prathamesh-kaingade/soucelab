package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
//	 to read data stored in property file
	public static String readProperty(String value) throws Exception
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\91928\\eclipse-workspace\\MavenProject\\TestData\\config.properties");
		p.load(file);
		return p.getProperty(value);
		
	}
//	To read data from excel sheet
	public static String readExcelFile(int row,int col) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91928\\eclipse-workspace\\MavenProject\\TestData\\Data.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("sheet1");
		 String value =  excel.getRow(row).getCell(col).getStringCellValue();
		 return value;
	}

}
