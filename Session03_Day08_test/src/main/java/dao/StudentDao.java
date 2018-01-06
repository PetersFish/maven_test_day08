package dao;

import java.util.List;

import pojo.Student;

public interface StudentDao {
	
	//存储Student
	void save(Student stu);
	
	//通过id获取Student对象
	Student getStudentById(Integer id);
	
	//通过名字获取Student对象
	Student getStudentByName(String name);
	
	//获得Student容器list
	List<Student> getList();
}
