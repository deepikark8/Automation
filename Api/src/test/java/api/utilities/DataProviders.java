package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

/*
 * DataProvider - data driven test
 *
 * Excel sheet - we have data - data provider is annotation method- provide data to test method-
 * this get data from excel sheet and provide data to test method..
 * Using looping we fetch data using data provider
 *
 *
 * @author rahade
 *
 */


public class DataProviders {


	@DataProvider(name = "Data")
	  public String[][] getAllData() throws IOException{
		System.out.println("user.dir");
		String path = "/Users/rahade/workspaceInterView/Api/testData/Userdata.xlsx";
				//System.getProperty("user.dir")+"//testData//Userdata.xlsx"; //-> current project location
		XLUtility xl=new XLUtility(path);

		int rownum=xl.getRowCount("Sheet1");
		int colcount=xl.getCellCount("Sheet1", 1);//sheetname with row number

		String apidata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				apidata[i-1][j]=xl.getCellData("Sheet1",i,j);
			}
		}
		return apidata;



	}


	@DataProvider(name="UserNames")
	public String[] getUserNames() throws IOException {

		String path="/Users/rahade/workspaceInterView/Api/testData/Userdata.xlsx";
				//System.getProperty("user.dir")+"//Userdata.xlsx";
		XLUtility xl=new XLUtility(path);

		int rownum=xl.getRowCount("Sheet1");
		//int colcount=xl.getCellCount("Sheet1",1);

		String apidata[]=new String[rownum];

		for(int i=1;i<=rownum;i++) {

			//for(int j=0;j<colcount;j++) {

				//apidata[i-1][j]=xl.getCellData("Sheet1",i,j);
				apidata[i-1]=xl.getCellData("Sheet1",i,1);
			//}
		}


		return apidata;


	}
}
