
package excel.write;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Workbook1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet ws= wb.getSheet("Sheet1");
		
		//Case 1 : Modify an existing Cell, replace failed with Passed 
		//ws.getRow(0).getCell(2).setCellValue("Passed1");
		
		//Case 2: write something and create a new cell(Cell is empty, so we will write in it)
		
		//ws.getRow(1).getCell(2).setCellValue(789);
		
		//Case 3: Create new row and create a cell 
		
		ws.createRow(3).createCell(0).setCellValue("Seconds222");
		
		//you want to write to File 
		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\Workbook1.xlsx");
		
		//write method 
		wb.write(fos);
		
		//Close file 
		wb.close();
	
	
	}

}
