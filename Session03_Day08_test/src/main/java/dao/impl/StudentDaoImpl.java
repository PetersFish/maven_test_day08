package dao.impl;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dao.StudentDao;
import pojo.Student;

public class StudentDaoImpl implements StudentDao {

	private static List<Student> list = null;
	
	//≥ı ºªØlist
	static {
		ObjectInputStream inputStream = null;
		ObjectOutputStream outputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream("file/StudentContainer.txt"));
			list = (List<Student>) inputStream.readObject();
			//System.out.println(list);
		} catch (EOFException e) {
			// TODO: handle exception
			list = new ArrayList<>();
			try {
				outputStream = new ObjectOutputStream(new FileOutputStream("file/StudentContainer.txt"));
				outputStream.writeObject(list);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				if(outputStream != null) {
					try {
						outputStream.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void save(Student stu) {
		// TODO Auto-generated method stub
		ObjectOutputStream outputStream = null;
		try {
			list.add(stu);
			outputStream = new ObjectOutputStream(new FileOutputStream("file/StudentContainer.txt"));
			outputStream.writeObject(list);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} 
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		Student student = null;
		for(Iterator<Student> it = list.iterator(); it.hasNext();) {
			student = it.next();
			if(student.getId() != null && id == student.getId()) {
				break;
			}
		}
		return student;
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		Student student = null;
		for(Iterator<Student> it = list.iterator(); it.hasNext();) {
			student = it.next();
			if(student.getName() != null && name.equals(student.getName())) {
				break;
			}
		}
		return student;
	}

	@Override
	public List<Student> getList() {
		// TODO Auto-generated method stub
		return list;
	}
	
	public static void main(String[] args) {
		
	}

}
