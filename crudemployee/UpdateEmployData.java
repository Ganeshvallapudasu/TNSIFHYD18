package crudemployee;

import java.sql.*;


public class UpdateEmployData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "ganesh";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE employee SET phno=?,email=? WHERE employeename=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "7205896474");
		    statement.setString(2, "aasrith23@gmail.com");
		    statement.setString(3, "aasrith");
		   
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
