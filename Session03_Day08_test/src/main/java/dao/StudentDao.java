package dao;

import java.util.List;

import pojo.Student;

public interface StudentDao {
	
	//�洢Student
	void save(Student stu);
	
	//ͨ��id��ȡStudent����
	Student getStudentById(Integer id);
	
	//ͨ�����ֻ�ȡStudent����
	Student getStudentByName(String name);
	
	//���Student����list
	List<Student> getList();
}
