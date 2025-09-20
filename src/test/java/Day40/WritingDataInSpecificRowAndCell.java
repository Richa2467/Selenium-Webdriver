package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file -----> Workbook ------> Sheets ----------->Rows-------------->Cells

public class WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+ "\\TestData\\myfile_random.xlsx");
		
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("RandomData");
		
		
		
		XSSFRow row=sheet.createRow(3);
		XSSFCell cell=row.createCell(4);
		cell.setCellValue("Welcome");
		
		
		
		
		workbook.write(file);                  //attach workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("file is created");
		
		
		
		
		
		
		
		

	}

}
