package UtilLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {
   public static XSSFWorkbook book;
	public static  XSSFSheet sheet;
	 
	public ExcelReader(String excel) throws IOException
	{
		File f=new File(excel);
		try {
			  FileInputStream fis=new FileInputStream(f);
			  
			   book=new XSSFWorkbook(fis); 
			  
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int lastRowCount(int sheetIndex)
	{
	   sheet=book.getSheetAt(sheetIndex);
	   int rows=sheet.getLastRowNum();
	   rows=rows+1;
	   return rows;
	}
	public String getData(int sheetIndex,int row,int cell)	
	{ 
		sheet=book.getSheetAt(sheetIndex);
		String data =sheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
	    	
	}

	
}	

