package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.met.model.Account;

public class JDBCtest {
	
	public static void saveUsingJDBC(Account acc) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException el) {
			el.printStackTrace();
			return;
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hr", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("insert into account values(?,?,?)")){
			
			pstmt.setInt(1, acc.getId());
			pstmt.setString(2, acc.getName());
			pstmt.setDouble(3, acc.getBalance());
			
			pstmt.executeUpdate();
			
			System.out.println("record inserted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		account.setId(4);
		account.setName("reyash");
		account.setBalance(540000);
		
		saveUsingJDBC(account);
		
	}
}
