package payroll.admin;


import java.sql.*;


public class Conn {
	public Connection c;
	public Statement s;
	public Conn() {
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","");
			s=c.createStatement();
			System.out.println("Successfull");
		}
		 catch (Exception e) {
			System.out.println("Connection Failed");
		}
	}
	
	
		
}

