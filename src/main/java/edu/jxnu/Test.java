package edu.jxnu;

public class Test {
     private int ID;
     private String value;
	public int getID() {
		System.out.println("left");
		return ID;		
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Test [ID=" + ID + ", value=" + value + "]";
	}
     
}
