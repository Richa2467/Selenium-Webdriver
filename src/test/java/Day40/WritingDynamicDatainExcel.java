package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file -----> Workbook ------> Sheets ----------->Rows-------------->Cells

public class WritingDynamicDatainExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+ "\\TestData\\myfile_dynamic.xlsx");
		
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner  sc=new Scanner(System.in);
		
		System.out.println("How amny rows you want to have:");
		int noofrows=sc.nextInt();
		

		System.out.println("How amny cells you want to have:");
		int noofcells=sc.nextInt();
		
		for(int r=0; r<=noofrows; r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			
			for(int c=0; c<noofcells; c++)
			{
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		
		XSSFRow row1=sheet.createRow(0);
		
		
		
		
		workbook.write(file);                  //attach workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("file is created");
		
		
		
		
		
		
		
		

	}

}
