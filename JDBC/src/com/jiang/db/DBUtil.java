package com.jiang.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/gril";
	private static final String USER = "root";
	private static final String	PASSWORD = "a941118";	
	private static Connection con = null; 
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try {
				con = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			// TODO Auto-generated catch block
			
		}	
		
	
	public static Connection getConnection() {
		return con;
	} 
public static void main(String[] args) throws ClassNotFoundException, Exception {
	//Class.forName("com.mysql.jdbc.Driver");
	//Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
	while(rs.next())
	{
		System.out.println(rs.getString("user_name")+","+rs.getInt("age"));
	}
}
}
