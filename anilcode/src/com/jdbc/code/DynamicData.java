package com.jdbc.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class DynamicData {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/anildb","root","root");
			Statement st= con.createStatement();
			
			while(true) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter movie id");
			int mid=sc.nextInt();
			System.out.println("enter movie name");
			String mnmae=sc.next();
			System.out.println("enter movie hero");
			String mher=sc.next();
			System.out.println("enter movie heroin");
			String mhin=sc.next();
			String sqlQuery=String.format("insert into movie values(%d,'%s','%s','%s')", mid,mnmae,mher,mhin);
			int countrow=st.executeUpdate(sqlQuery);
			System.out.println("No of row updated "+ countrow);
			
			System.out.println("Do you want to enter anothe record Yes/No");
			String option=sc.next();
			if(option.equalsIgnoreCase("No")) {
				break;
			}
			
			
			}
			
			
			con.close();
			System.out.println("Connection closse");
		
	}
	
	
}
