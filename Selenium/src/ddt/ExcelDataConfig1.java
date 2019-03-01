package ddt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig1 {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig1(String excelpath) {
		File src = new File(excelpath);
		try {
			FileInputStream fin = new FileInputStream(src);
			wb= new XSSFWorkbook(fin);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		}
	public String getData(int sheetnumber,int row,int column) {
		sheet1 = wb.getSheetAt(sheetnumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
}
	public int getRowCount(int sheetIndex) {
	int row =	wb.getSheetAt(sheetIndex).getLastRowNum();
	row = row +1;
		
		return row;
		
	}

}
