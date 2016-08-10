package com.ixs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class DBUtill {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/yangjigl?useUnicode=true&amp;characterEncoding=utf-8";
	private static final String USER = "root";
	private static final String PASSWORD = "264530";

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery("select CustomerID,CustomerName from t_customer");
		while (rs.next()) {
			System.out.println(rs.getString("CustomerID") + "," + rs.getString("CustomerName"));
		}
	}
}