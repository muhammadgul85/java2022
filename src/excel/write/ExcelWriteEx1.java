package excel.write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Workbook1.xlsx");
		XSSFWorkbook wb1 = new XSSFWorkbook(fis);
		XSSFSheet ws1 = wb1.getSheet("Sheet1");
		
		//Modify an existing Cell, replace Passed with Multimedia 
		ws1.getRow(0).getCell(2).setCellValue("MultiMedia");
		
		//Create a new row and cell and add value 786
		
		ws1.createRow(5).createCell(0).setCellValue(786);
		
		
		
		//Create a new row and create a record 
		ws1.createRow(4).createCell(0).setCellValue("Focus on Action Only");
		
		//Row exists and create cell 
		
		ws1.getRow(4).createCell(1).setCellValue("Hello2");
		//You want to write to the File FOS 
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\Workbook1.xlsx");
		wb1.write(fos);
		
		wb1.close();
		

	}

}
