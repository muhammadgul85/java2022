package excel.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUsingIterator2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\Java-Reyaz\\ExcelFile\\LoginData.xlsx");
		XSSFWorkbook wb1 =new XSSFWorkbook(fis);
		XSSFSheet sheet = wb1.getSheet("credentials");
		
		Iterator<Row> rows = sheet.rowIterator();
		
		Row row =null;
		Cell cell = null;
		while(rows.hasNext())
		{
			row = rows.next();
			
			//row has cells, use iterator
			
			Iterator<Cell> cells = row.cellIterator();
			
			while(cells.hasNext())
			{
				cell = cells.next();
				
				
				if(cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println("Cell Type is Numeric" + cell.getNumericCellValue());
					
				}
				else if(cell.getCellType()== CellType.STRING)
				{
					System.out.println("String: " + cell.getStringCellValue());
				}
				else if(cell.getCellType() == CellType.BOOLEAN)
				{
					System.out.println("Boolean: " + cell.getBooleanCellValue());
				}
				
				
			}
			
			
		}
		
		

	}

}
