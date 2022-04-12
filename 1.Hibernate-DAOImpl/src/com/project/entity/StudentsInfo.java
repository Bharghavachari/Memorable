package com.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.hibernate.annotations.Table;

@javax.persistence.Table (name = "studentsinfo")
@Entity
public class StudentsInfo implements Serializable {
	@Id
	
	@Column
	private int sid;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int age;

	public StudentsInfo() {
		super();

	}

	public StudentsInfo(int sid, String firstName, String lastName, int age) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentsInfo [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	
	
	
}
