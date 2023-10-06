package cdac.springmvc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import cdac.springmvc.model.Student;

import org.springframework.jdbc.core.RowMapper;



public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setAddress(rs.getString(3));
		s.setMarks(rs.getInt(4));
		return s;
	}
	

}
