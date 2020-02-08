package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NormalReadExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook=new XSSFWorkbook("./data/TC001_CreateLead.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int columncount = wsheet.getRow(0).getLastCellNum();
		int rowcount = wsheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = wsheet.getRow(i);
			
		
		for(int j=0;j<columncount;j++) {
			XSSFCell cell=row.getCell(j);
			String value = cell.getStringCellValue();
			//System.out.print(value+" ");
		}
		//System.out.println();
	}
		

}

}
