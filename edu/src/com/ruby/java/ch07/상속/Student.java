package com.ruby.java.ch07.상속;

public class Student extends Person{
	//private String name;
	//private int age;
	private String major;
	
	public Student() {
		System.out.println("Student 생성자 실행!");
	}
	public Student(String name, int age, String major) {
		super(name, age); this.major = major;
		//super.setName(name); super.setAge(age); this.major = major;
		//this.name = name; this.age = age; this.major = major;
	}
	/*
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	*/
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
