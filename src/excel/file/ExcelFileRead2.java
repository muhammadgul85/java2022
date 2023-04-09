package excel.file;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\User\\Documents\\Java-Reyaz\\ExcelFile\\LoginData.xlsx");
		
		//Go to WorkBook, XSSFWorkbook Constructor
		XSSFWorkbook wb = new XSSFWorkbook(fis1);
		
		XSSFSheet ws = wb.getSheet("credentials");
		
		System.out.println("Number of Rows: " + ws.getPhysicalNumberOfRows());
		int noOfRows = ws.getPhysicalNumberOfRows();
		
		
		System.out.println(ws.getRow(1).getPhysicalNumberOfCells());
		System.out.println(ws.getRow(2).getPhysicalNumberOfCells());
		//To ignore the first row you can
		//rows.next();
		
		
		
		for (int i=0; i< noOfRows; i++)
		{
			Row row = ws.getRow(i);
			int noOfCells = row.getPhysicalNumberOfCells();
			
			for (int j=0; j<noOfCells; j++)
			{
				Cell cell = row.getCell(j);
				
				//to get data from cell we need to find out what type of cell it is
				
				if(cell.getCellType()==CellType.STRING)
				{
					System.out.println("Cell Type is string: "+ cell.getStringCellValue()+ "\t");
				}
				else if (cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println("Numeric Cell Type: " + cell.getNumericCellValue()+ "\t");
				}
				
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					System.out.println("Boolean: " + cell.getBooleanCellValue()+ "\t");
				}
				System.out.println();
			}
		}
		
		
		
	}

}
