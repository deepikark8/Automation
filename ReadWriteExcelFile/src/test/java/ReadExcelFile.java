import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFile {
	
	
	public static void main(String[] args) throws Exception  {
		
		
		String filePath = "/Users/rahade/workspaceInterView/ReadWriteExcelFile/application.xlsx";
		FileInputStream fileInput = new FileInputStream(filePath);
       
		XSSFWorkbook workBook = new XSSFWorkbook(fileInput);
        XSSFSheet sheet = workBook.getSheetAt(0);
        //workBook.getSheet("Home");
        
        String cellValue = sheet.getRow(0).getCell(1).getStringCellValue();
        System.out.println(cellValue);
        
        int totalRows = 4;
        int totalCol = 3;
        
        for(int i=1; i<=totalRows;i++) {
        	for(int j=0;j<totalCol;j++) {
        		System.out.println(sheet.getRow(i).getCell(j));
        		System.out.println("\t");
        	}
        	System.out.println("\n");
        }
        
        workBook.close();
        fileInput.close();
        
	}

}
