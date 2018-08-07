package com;

public class Person {
	private int pId;
	private String name;
	public Person(int pId, String name) {
		super();
		this.pId = pId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + "]";
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
