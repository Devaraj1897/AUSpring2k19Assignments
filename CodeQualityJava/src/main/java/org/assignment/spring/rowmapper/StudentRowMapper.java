package org.assignment.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.assignment.spring.services.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		
		student.setRegnum(rs.getString("regnum"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setAddress(rs.getString("address"));
		student.setPhone(rs.getInt("phone"));
		return student;
	}
	
	

}
