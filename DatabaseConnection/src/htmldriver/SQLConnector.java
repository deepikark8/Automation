package htmldriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnector {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//"jdbc:mysql://ipadddress:portnumber/db_name"
		String dbUrl = "jdbc:mysql://localhost:3306/emp?characterEncoding=utf8";
		
		//Database Username
		String username = "root";
		
		//Database password
		String password = "password@123";
		
		//Query to Execute
		String query = "select * from employee;";
		
		
		//Load mysql jdbc driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		
		
		//Create Statement Object
		Statement stmt = con.createStatement();
		
		
		//Execute the Sql Query. Store results in resultset
		ResultSet rs = stmt.executeQuery(query);
		
		//While loop to iterate through all data and print results
		while(rs.next()) {
			String myName = rs.getString(1);
			String myAge = rs.getString(2);
			System.out.println(myName+"  "+myAge);
			
		}
		
		//Closing Db connection
		con.close();
		
		
	}

}
