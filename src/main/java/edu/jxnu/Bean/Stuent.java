package edu.jxnu.Bean;

public class Stuent {
	private String name;
	private String sex;
	private String secondName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	@Override
	public String toString() {
		return "Stuent [name=" + name + ", sex=" + sex + ", secondName=" + secondName + "]";
	}
	
	

}
