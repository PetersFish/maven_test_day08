package service.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import pojo.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

	private static ApplicationContext ac = null;
	static {
		ac = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
	}
	
	@Override
	public void save(Student stu) {
		// TODO Auto-generated method stub
		StudentDaoImpl studentDaoImpl = ac.getBean("studentDaoImpl", StudentDaoImpl.class);
		studentDaoImpl.save(stu);
	}
	
	@Override
	public List<Student> getList() {
		// TODO Auto-generated method stub
		StudentDaoImpl studentDaoImpl = ac.getBean("studentDaoImpl", StudentDaoImpl.class);
		List<Student> list = studentDaoImpl.getList();
		return list;
	}

}
