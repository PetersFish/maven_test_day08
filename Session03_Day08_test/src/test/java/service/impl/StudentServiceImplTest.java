package service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import pojo.Student;

public class StudentServiceImplTest {

	private static ApplicationContext ac = null;
	private static StudentServiceImpl serviceImpl = null;
	
	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ac = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		serviceImpl = ac.getBean("studentServiceImpl", StudentServiceImpl.class);
	}
	
	//测试存储功能
	@Test
	public void testSave() {
		Student stu = new Student();
		stu.setId(3);
		stu.setName("Jack");
		stu.setScore("87");
		serviceImpl.save(stu );
	}
	
	//测试获取集合的功能
	@Test
	public void testGetList() {
		List<Student> list = serviceImpl.getList();
		System.out.println(list);
	}

}
