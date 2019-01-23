package org.assignment.spring.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.assignment.spring.rowmapper.StudentRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public StudentDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveOrUpdate(Student student) {

		String sql = "INSERT INTO student (name, age,regnum, address, phone)" + " VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql, student.getName(), student.getAge(),student.getRegnum(), student.getAddress(), student.getPhone());

	}

	public void delete(String regnum) {
		String sql = "DELETE FROM student WHERE contact_id=?";
		jdbcTemplate.update(sql, regnum);

	}

	public List<Student> getAllStudents() {

		String sql = "SELECT * FROM student";
		return  jdbcTemplate.query(sql, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stud = new Student();

				stud.setRegnum(rs.getString("regnum"));
				stud.setName(rs.getString("name"));
				stud.setAddress(rs.getString("address"));
				stud.setAge(rs.getInt("age"));
				stud.setPhone(rs.getInt("phone"));

				return stud;
			}

		});

		
	}

	@SuppressWarnings("unchecked")
	public Student get(String regnum) {
		
		
		String sql= "select * from Student where regnum = ? ";
		return (Student)jdbcTemplate.queryForObject(sql, new Object[] { regnum }, new StudentRowMapper());

	}
}