package crudemployee;

import java.sql.*;


public class DeleteEmployeData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "ganesh";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM employee WHERE employeename=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "ganesh");
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A user was deleted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
