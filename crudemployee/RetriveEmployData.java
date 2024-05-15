package crudemployee;

import java.sql.*;


public class RetriveEmployData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "ganesh";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString(2);
			    String pass = result.getString(3);
			    String fullname = result.getString("employeename");
			    String email = result.getString("email");
			 
			    String output = "User #%d: %s - %s- %s - %s";
			    System.out.println(String.format(output, ++count, name, pass,fullname, email));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
