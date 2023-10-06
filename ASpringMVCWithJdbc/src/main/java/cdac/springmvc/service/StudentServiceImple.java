package cdac.springmvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cdac.springmvc.Dao.StudentDao;
import cdac.springmvc.model.Student;

@Service
public class StudentServiceImple implements StudentService{
	@Autowired
	StudentDao studentDao;
	@Override
	public int save(Student s) {
		//you can write only this much...return studentDao.save(s);
		return this.studentDao.save(s);
	}

	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
		return this.studentDao.get(id);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return this.studentDao.getAll();
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return this.studentDao.delete(id);
	}

	@Override
	public int update(Student s) {
		// TODO Auto-generated method stub
		return this.studentDao.update(s);
	}
	


}
