package SingleResponsobolityPrinciple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepositoryAfter {

	
	public void save(EmployeeAfter employee) {
		//Serialize object into a string representation
				String objectStr = null; //Utils.seriallzeIntoAsString(employee);
				Connection connection = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDb", "root", "password");
					stmt = connection.createStatement();
					
					stmt.execute("INSERT INTO EMPLOYEE VALUES (" + objectStr + ")");
					
				}catch(Exception e) {
					e.printStackTrace();
				}
	}
	
}
