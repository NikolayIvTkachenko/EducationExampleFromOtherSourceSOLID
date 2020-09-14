package SingleResponsobolityPrinciple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class StudentAfter {

	private String studentId;
	private Date studentDOB;
	private String address;
	
	public void save() {
		new StudentRepositoryAfter().save(this);
	}
	
	public String getStudentId() {
		return studentId;
	}
	
}
