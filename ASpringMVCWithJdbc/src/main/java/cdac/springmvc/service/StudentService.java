package cdac.springmvc.service;

import java.util.List;

import cdac.springmvc.model.Student;

public interface StudentService {
	public int save(Student s);
	public Student get(int id);
	public List<Student> getAll();
	public int delete(int id);
	public int update(Student s);

}
