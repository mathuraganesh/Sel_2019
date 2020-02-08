package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
@Test
	public String[][] readExcel(String excelFileName) throws IOException{
		XSSFWorkbook wbook=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int columncount = wsheet.getRow(0).getLastCellNum();
		int rowcount = wsheet.getLastRowNum();
		String[][] data=new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = wsheet.getRow(i);
			
		
		for(int j=0;j<columncount;j++) {
			XSSFCell cell=row.getCell(j);
			String value = cell.getStringCellValue();
			data[i-1][j]=value;
			//System.out.print(value+" ");
		}
		//System.out.println();
	}
		wbook.close();
		return data;
	}


}
