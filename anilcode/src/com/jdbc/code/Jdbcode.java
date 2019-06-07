package com.jdbc.code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbcode {
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anildb", "root", "root");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("SELECT * FROM movie");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "============" +   rs.getString(2) + "============" +   rs.getString(3)+ "============" +   rs.getString(4));
			
		}
	
}
}
