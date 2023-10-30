package Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonUtilities {

	public String getString() throws IOException {
		String filePath = "/Users/rahade/workspaceInterView/TestNGFramework/";
		
		String fileName = "application.xlsx";
		String sheetName ="Sheet1";
		String sUrl = readExcelFile(filePath,fileName,sheetName);
		return sUrl;
		
		
	}
	
	public String readExcelFile(String filePath ,String fileName, String sheetName) throws IOException {
		
		File file = new File(filePath);
		FileInputStream fileInput = new FileInputStream(file);
        XSSFWorkbook workBook = new XSSFWorkbook(fileInput);
        XSSFSheet sheet = workBook.getSheetAt(0);
        String cellValue = sheet.getRow(0).getCell(1).getStringCellValue();
        System.out.println(cellValue);
        
        workBook.close();
        fileInput.close();
		return cellValue;
	}
	
}
