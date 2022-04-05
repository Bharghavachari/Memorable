package com.project.entity;

import java.io.Serializable;

public class Trainee implements Serializable  {
	private int id;
	private String name;
	private String gender;
	private String designation;
	private long   mobileNumber;
	private String lacation;
	private int    salary;
	
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainee(int id, String name, String gender, String designation, long mobileNumber, String lacation,
			int salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
		this.mobileNumber = mobileNumber;
		this.lacation = lacation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLacation() {
		return lacation;
	}

	public void setLacation(String lacation) {
		this.lacation = lacation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", gender=" + gender + ", designation=" + designation
				+ ", mobileNumber=" + mobileNumber + ", lacation=" + lacation + ", salary=" + salary + "]";
	}
	
	
	
}
