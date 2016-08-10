package com.ixs.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ixs.model.T_BorrowRecord;
import com.ixs.model.T_Customer;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		//连接、输入、增加到数据库、保存到list
		Connection();
		
		Scanner console=new Scanner(System.in);
		
		T_Customer customer = new T_Customer();
		System.out.println("请输入用户ID");
		int i=console.nextInt();
		customer.setCustomerID(i);
		
		System.out.println("请输入CustomerName");
		String temp=console.next();
		customer.setCustomerName(temp);
		
		System.out.println("请输入RelationName");
		temp=console.next();
		customer.setRelationName(temp);
		
		System.out.println("请输入RelationPhone");
		temp=console.next();
		customer.setRelationPhone(temp);
		
		customer.setAddress("橘园洲");
		customer.setEmail("sallly@qq.com");
		customer.setRemark("0");
		insertcustomer(customer);
		
		List<T_Customer> T_Customers = new ArrayList<T_Customer>();
		T_Customers.add(customer );
	
		
		System.out.println("有如下客户(通过for each访问)");
         for(T_Customer t:T_Customers)
			 System.out.println("***"+t.getCustomerID()+":"+t.getCustomerName());
         
        // deletecustomer(customer.getCustomerID())
         
	}

	private static void insertcustomer(T_Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = Connection();
			stmt = conn.prepareStatement("INSERT INTO t_customer VALUES(?, ?,?,?,?,?,?)");
			stmt.setInt(1, customer.getCustomerID());
			stmt.setString(2, customer.getCustomerName());
			stmt.setString(3, customer.getRelationName());
			stmt.setString(4, customer.getRelationPhone());
			stmt.setString(5, customer.getAddress());
			stmt.setString(6, customer.getEmail());
			stmt.setString(7, customer.getRemark());
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				stmt.close();
			}
		}

	}

	private static Connection Connection() throws Exception {
		// TODO Auto-generated method stub
		final String URL = "jdbc:mysql://127.0.0.1:3306/yangjigl?useUnicode=true&amp;characterEncoding=utf-8";
		final String USER = "root";
		final String PASSWORD = "264530";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
		Statement stmt = (Statement) conn.createStatement();
		
		return conn;

	}

}
