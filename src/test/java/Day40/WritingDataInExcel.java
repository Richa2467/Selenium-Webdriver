package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file -----> Workbook ------> Sheets ----------->Rows-------------->Cells

public class WritingDataInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+ "\\TestData\\myfile.xlsx");
		
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Python");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("AUtomation");
		
		
		
	XSSFRow row2=sheet.createRow(1);
		
		row2.createCell(0).setCellValue("Java");
		row2.createCell(1).setCellValue(124);
		row2.createCell(2).setCellValue("AUtomation");
		
		
	XSSFRow row3=sheet.createRow(2);
		
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(12);
		row3.createCell(2).setCellValue("AUtomation");
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("file is created");
		
		
		
		
		
		
		
		

	}

}
