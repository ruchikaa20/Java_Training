package multiThreadingSer;

import java.io.Serializable;

public class person implements Serializable{
	private String name;
	private int id;
	
	public person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", id=" + id + "]";
	}
	
	
}
