package excel.file;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile2UsingIterator {
	public static void main(String[] args) throws IOException {
		
		//How to read Excel File 
		
		//First of all it's a file, then Excel file, I want to read this file
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Workbook1.xlsx");
		
		//Go to WorkBook, XSSFWorkbook Constructor
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Go to Sheet, Now select the sheet you want to use by creating object of sheet
		XSSFSheet ws = wb.getSheet("Sheet1");//Non Static Factory Method
		
		Iterator<Row> rows = ws.rowIterator();
		
		Row row = null; //for example x =10; 
		Cell cell =null;
		while(rows.hasNext())
		{
			row= rows.next();
			//row has cells
			Iterator<Cell> cells = row.cellIterator();
			while(cells.hasNext())
			{
				cell = cells.next();
				if(cell.getCellType() == CellType.STRING)
				{
					System.out.println(cell.getStringCellValue() + " is a String");
				}
				else if (cell.getCellType()== CellType.NUMERIC)
				{
					System.out.println(cell.getNumericCellValue()+ " is a Number");
				}
				else if (cell.getCellType()== CellType.BOOLEAN)
				{
					System.out.println(cell.getBooleanCellValue()+ " is a Boolean");
				}
			}
		}
		
	}
}
