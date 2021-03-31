package com.osa.fiels;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileManager {
public static void main(String[] args) {

	
	Object data[][]=readExcelFile("src\\test\\resources\\Book1.xlsx","TestData");
	for (int i=1; i<data.length; i++) {
	for(int j=0; j<data[i].length; j++) {
		System.out.println(data[i][j]);
	}
	System.out.println();
}
  }


public static Object[][] readExcelFile(String path,String sheetName) {
	Object data[][]=null;
	DataFormatter formatter=new DataFormatter();
	try {
	File file=new File(path);
	FileInputStream fileInput=new FileInputStream(file);
	XSSFWorkbook workbook=new XSSFWorkbook(fileInput);
	XSSFSheet sheet=workbook.getSheet(sheetName);
	int rowSize= sheet.getPhysicalNumberOfRows();
	int colSize=sheet.getRow(0).getLastCellNum();
	data=new Object[rowSize][colSize];
		Iterator<Row> rowIterator=sheet.rowIterator();
		int rowCount=0;	
		while(rowIterator.hasNext()) {
			Row row=rowIterator.next();
			Iterator<Cell> cellIterator=row.cellIterator();
			int colCount=0;
			while(cellIterator.hasNext()) {
				Cell cell=cellIterator.next();
				data[rowCount][colCount]=formatter.formatCellValue(cell);
				colCount++;
			}
			rowCount++;
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return data;
	}
}




