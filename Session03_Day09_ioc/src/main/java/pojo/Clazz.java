package pojo;

import java.io.Serializable;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Clazz implements Serializable{
	private Integer id;
	private String name;
	private Set<Student> students;
	private Map<String, Object> info;
	private Properties properties;
	
	public Clazz() {}
	
	public Clazz(Integer id, String name, Set<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Object> getInfo() {
		return info;
	}

	public void setInfo(Map<String, Object> info) {
		this.info = info;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Clazz [id=" + id + ", name=" + name + ", students=" + students + ", info=" + info + ", properties="
				+ properties + "]";
	}

	
}
