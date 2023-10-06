package cdac.springmvc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import cdac.springmvc.model.Student;

@Repository
public class StudentDaoImple implements StudentDao{
	@Autowired // automatically u'll get object of jdbctemplete fm congig.. becz u gava access to all base package
	JdbcTemplate jdbcTemplete;

	
	@Override
	public int save(Student s) {
		String query ="insert into student values(?,?,?,?)";
		int r = jdbcTemplete.update(query,s.getId(),s.getName(),s.getAddress(),s.getMarks());
		return r;
	}

	@Override
	public Student get(int id) {
		String query ="select * from student where id=?";
		RowMapper<Student> rowmapper = new RowMapperImpl();
		Student s = jdbcTemplete.queryForObject(query, rowmapper,id);
		
		return s;
	}

	@Override
	public List<Student> getAll() {
		String query ="select * from student";
		List<Student> s = jdbcTemplete.query(query, new RowMapperImpl());
		return s;
	}

	@Override
	public int delete(int id) {
		String query ="delete from student where id=?";
		int r = jdbcTemplete.update(query,id);
		return r;
	}

	@Override
	public int update(Student s) {
		String sql="update student set address = ? where id=?";
		return jdbcTemplete.update(sql, s.getAddress(),s.getId());
		
	}

}
