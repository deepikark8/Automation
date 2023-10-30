import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ReadExcel {
	
	static XSSFWorkbook excelWorkBook;
	 static XSSFSheet excelWorkSheet;
	 private static XSSFCell Cell;
	
	 @DataProvider(name= "SearchFromExcel")
	  	public Object[][] excelDP() throws IOException{
	        	//We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
	        	Object[][] arrObj = getExcelData("/Users/rahade/InterviewPreparation/DataProvider/Testdata/userdata.xlsx","Sheet 1");
	 
	        	return arrObj;
//	        	return new Object[][]{
//	        		{"Selenium","Delhi"},{"QTP","Bangalore"},{"LoadRunner","Chennai"}
//	        	};

	        	
	 }
	 
	 
	 public String[][] getExcelData(String fileName, String sheetName) throws IOException {
		
		System.out.println("getExcelData");
		
		FileInputStream excelFile = new FileInputStream(fileName);
		String[][] data = null;   	
		 
		 excelWorkBook = new XSSFWorkbook(excelFile);
		 excelWorkSheet = excelWorkBook.getSheet(sheetName); //---> Sheet name
		 
		 //System.out.println(excelWorkSheet.getRow(2).getCell(0));
		 
		 
	  	 XSSFRow row = excelWorkSheet.getRow(0);
		 int totalRows = 2;  //excelWorkSheet.getPhysicalNumberOfRows();//4;
		 int totalcols = 2; //row.getLastCellNum();//3;
		 data = new String[totalRows-1][totalcols];
		 
		 
//		 for(int i=1; i<=totalRows;i++) {
//			 for(int j=0;j<totalcols;j++) {
//				 
//				 System.out.print(excelWorkSheet.getRow(i).getCell(j));
//				  value = String.valueOf(excelWorkSheet.getRow(i).getCell(j));
//				  System.out.println("value :"+value);
//				 System.out.print("\t");
//			 }
//			 System.out.println("\n");
//		 }
		 
		 
		 for(int i =1; i<totalRows;i++){
  		     for(int j=0;j<totalcols;j++){
  		    	   row = excelWorkSheet.getRow(i);
  		    	 Cell= row.getCell(j);
  		    	   data[i-1][j] = Cell.getStringCellValue();
  	   	 	   }
  	   	}
		 
		//System.out.println("Data :"+data);
		 
		return data;
		
	}

}
