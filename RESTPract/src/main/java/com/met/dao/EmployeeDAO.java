package com.met.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.met.emp.Employee;
import com.mysql.cj.xdevapi.PreparableStatement;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared;

@Repository
public class EmployeeDAO {

	@Autowired
	private DataSource mySQLDataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveUsingDataSource(Employee emp) {
		try (Connection con = mySQLDataSource.getConnection()){
			PreparedStatement pstmt =con.prepareStatement("insert into "+ "Employee values(?,?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getDesignation());
			pstmt.setString(4, emp.getEmailId());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
public  Collection<Employee> getAllEmployees(){
		
		
		return jdbcTemplate.query("select * from employee", 
				
					new BeanPropertyRowMapper<Employee>(Employee.class)
				
				
				);
		
		
	}
}
