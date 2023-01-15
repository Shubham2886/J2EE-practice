package com.met.iit.SpringbootTest.com.met.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.met.iit.SpringbootTest.com.met.emp.Employee;

@Repository
public class EmployeeDAO {
//
//	@Autowired
//	private DataSource mySQLDataSource;
//	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	
//	public void saveUsingDataSource(Employee emp) {
//		try (Connection con = mySQLDataSource.getConnection()){
//			PreparedStatement pstmt =con.prepareStatement("insert into "+ "Employee values(?,?,?,?)");
//			pstmt.setInt(1, emp.getId());
//			pstmt.setString(2, emp.getName());
//			pstmt.setString(3, emp.getDesignation());
//			pstmt.setString(4, emp.getEmailId());
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//	}
	

@SuppressWarnings("deprecation")
public Employee getEmployee(int id) {
		
		return jdbcTemplate.queryForObject("select * from Employee where id=?", 
				new Object[] {id}, new BeanPropertyRowMapper<>(Employee.class));
		
	}
	
public Collection<Employee> getAllEmployees(){
		
		
		return jdbcTemplate.query("select * from employee", 
				
					new BeanPropertyRowMapper<Employee>(Employee.class)
				
				
				);
		
		
	}
}
