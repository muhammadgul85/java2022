package excel.file;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {
	public static void main(String[] args) throws IOException {
		
		//How to read Excel File 
		//C:\Users\User\Desktop\Workbook1
		//First of all it's a file, then Excel file, I want to read this file
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Workbook1.xlsx");
		
		//Go to WorkBook, XSSFWorkbook Constructor
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Go to Sheet, Now select the sheet you want to use by creating object of sheet
		XSSFSheet ws = wb.getSheet("Sheet1");//Non Static Factory Method
		
		//Get physical Number of Rows 
		System.out.println("getPhysicalNumberOfRows: " + ws.getPhysicalNumberOfRows());
		int noOfRows = ws.getPhysicalNumberOfRows();
		
		//to reach to Row 1 and get physical number of cells
		System.out.println("getPhysicalNumberOfCells\t"+ws.getRow(0).getPhysicalNumberOfCells());
		System.out.println("getPhysicalNumberOfCells\t"+ws.getRow(1).getPhysicalNumberOfCells());
			
		for (int i=0; i< noOfRows; i++)
		{
			// in  row you get number of cellls
			Row row = ws.getRow(i);
			int noOfCells = row.getPhysicalNumberOfCells();
			
			for (int j=0; j<noOfCells; j++)
			{
				Cell cell = row.getCell(j);
				
				//to get data from cell, we need to find out what type of cell it is
				
				if(cell.getCellType()==CellType.STRING)
				{
					System.out.println("STRING: " +cell.getStringCellValue());
				}
				else if(cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println("NUMERIC: " + cell.getNumericCellValue());
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					System.out.println("BOOLEAN: " + cell.getBooleanCellValue());
				}
			}
		}		
	}
}
