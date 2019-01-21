package org.assignment.spring.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
		List<Student> listContact = jdbcTemplate.query(sql, new RowMapper<Student>() {

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

		return listContact;
	}

	public Student get(String regnum) {
		String sql = "SELECT * FROM student WHERE regnum='" + regnum+"';";
		return jdbcTemplate.query(sql, new ResultSetExtractor<Student>() {

			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Student stud = new Student();
					stud.setRegnum(rs.getString("regnum"));
					stud.setName(rs.getString("name"));
					stud.setAddress(rs.getString("address"));
					stud.setAge(rs.getInt("age"));
					stud.setPhone(rs.getInt("phone"));
					return stud;
				}

				return null;
			}

		});
	}

}