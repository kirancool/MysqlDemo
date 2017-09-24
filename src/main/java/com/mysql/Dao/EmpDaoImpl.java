package com.mysql.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("empDao")
public class EmpDaoImpl implements EmpDao{
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired
private DataSource dataSource;
	public void setTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
		
	}
	 
	public String getName(int id, String name, String location){

		String sql="insert into emp(id,name,location)values(?,?,?)";
		Connection connection = null;
		PreparedStatement ps = null;
		try {
	
			connection = dataSource.getConnection();
		
			ps = connection.prepareStatement(sql);
			
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,location);
			
			ps.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		 return name;
	}
}

