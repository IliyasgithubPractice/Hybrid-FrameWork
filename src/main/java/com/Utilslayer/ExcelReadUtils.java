package com.Utilslayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.Baselayer.Baseclass;


public class ExcelReadUtils extends Baseclass {
	static XSSFWorkbook workbook;
	public ExcelReadUtils(String path) throws Exception
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		workbook=new XSSFWorkbook(fis);
		
	}
	public static String getdata(int sheetindex,int row,int cell)
	{
		return workbook.getSheetAt(sheetindex).getRow(row).getCell(cell).getStringCellValue();
		
	}
	public static int getRowcount(int sheetindex)
	{
		return workbook.getSheetAt(sheetindex).getLastRowNum()+1;
	}
	public static int getCellcount(int sheetindex)
	{
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}
	
	public static Object[][] capdata(int sheetindex,String path) throws Exception {
		ExcelReadUtils excelreader = new ExcelReadUtils(path);
				

    	int Rows = excelreader.getRowcount(sheetindex);
		int Cell = excelreader.getCellcount(sheetindex);

		Object[][] data = new Object[Rows][Cell];
		for (int i = 0; i <Rows; i++) {
			for (int j = 0; j < Cell; j++) {
				data[i][j] = excelreader.getdata(sheetindex, i, j);
			}

		}

		return data;


}
	public static void getElement(WebElement wb,WebElement wb1,WebElement wb2,String a,String b,String c)
	{
		wb.sendKeys(a);
		wb1.sendKeys(b);
		wb2.sendKeys(c);
	}
	}
