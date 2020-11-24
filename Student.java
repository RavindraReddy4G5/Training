package com.jnit.JDBC.Day24_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:1432/motivity";
		String usename="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection(url, usename, password);
		Statement statement =connection.createStatement();
		int x=statement.executeUpdate("insert into employee values(1006,235000,'pavan','amazon')");
		
		
	}

}
