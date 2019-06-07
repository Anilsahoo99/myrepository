package com.jdbc.code;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/anildb", "root", "root");
		Statement st= con.createStatement();
		int rs= st.executeUpdate("update movie set hero='megamind' where id=2 ");
		
	
			System.out.println(rs);
		
		
	}
	
}
