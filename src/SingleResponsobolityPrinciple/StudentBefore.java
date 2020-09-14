package SingleResponsobolityPrinciple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class StudentBefore {
	
	private String studentId;
	private Date studentDOB;
	private String address;
	
	public void save() {
		//Serialize object into a string representation
		String objectStr = null; //Utils.seriallzeIntoAsString(this);
		Connection connection = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDb", "root", "password");
			stmt = connection.createStatement();
			
			stmt.execute("INSERT INTO STUDENT VALUES (" + objectStr + ")");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getStudentId() {
		return studentId;
	}
	

}
