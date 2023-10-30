package excelsheet.dataProvider;



import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;


/*
 * 
 *  ITestContext - Different test parameters based on groups
 * 
 */
public class DataProviderClass {

	static XSSFWorkbook excelWorkBook;
	 static XSSFSheet excelWorkSheet;
	
	@DataProvider(name= "SearchProviderFromExcel")
	public static Object[][] getDataFromDataprovider() throws Exception{

		String filePath = "/Users/rahade/InterviewPreparation/DataProvider/Testdata/userdata.xlsx";
		
		FileInputStream excelFile = new FileInputStream(filePath);
		
		
		 
		 
		 excelWorkBook = new XSSFWorkbook(excelFile);
		  excelWorkSheet = excelWorkBook.getSheet("Sheet1"); //---> Sheet name
		 
		 //System.out.println(excelWorkSheet.getRow(2).getCell(0));
		 
		 
		 int totalRows =4;
		 int totalcols = 3;
		 
		 for(int i=1; i<=totalRows;i++) {
			 for(int j=0;j<totalcols;j++) {
				 
				 System.out.print(excelWorkSheet.getRow(i).getCell(j));
				 System.out.print("\t");
			 }
			 System.out.println("\n");
		 }
		
		
		return null;		
		}
		
	}


