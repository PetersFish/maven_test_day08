package service;

import java.util.List;

import pojo.Student;

public interface StudentService {

	void save(Student stu);
	
	List<Student> getList();
}
