package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file -----> Workbook ------> Sheets ----------->Rows-------------->Cells


public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		FileInputStream File=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium-Webdriver\\TestData\\data.xlsx");
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		
//		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int totalRows=sheet.getLastRowNum();

		int totalCells=sheet.getRow(1).getLastCellNum();
		System.out.println("No of rows.. "+totalRows);  //5 (from 0)
		System.out.println("No of Cells..."+ totalCells);   //4(from 1)
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			
			for(int c=0; c<totalCells; c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+ "\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		

		
		


	}

}
