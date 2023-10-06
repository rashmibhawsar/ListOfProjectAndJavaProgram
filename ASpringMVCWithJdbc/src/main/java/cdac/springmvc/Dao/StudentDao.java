package cdac.springmvc.Dao;

import java.util.List;

import cdac.springmvc.model.Student;





public interface StudentDao {
	public int save(Student s);
	public Student get(int id);
	public List<Student> getAll();
	public int delete(int id);
	public int update(Student s);
	

}
