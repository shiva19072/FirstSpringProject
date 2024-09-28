package com.demo.studentmodule;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String college;
	private String roll;
	private String qualification;
	private Integer year;
	private String certificate;
	
//constructors	
public Student(Integer id, String name, String college, String roll, String qualification, Integer year,
			String certificate) {
	    this.id = id;
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.year = year;
		this.certificate = certificate;
	}

//super constructor
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

//getters and setters


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
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public String getRoll() {
	return roll;
}
public void setRoll(String roll) {
	this.roll = roll;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
public String getCertificate() {
	return certificate;
}
public void setCertificate(String certificate) {
	this.certificate = certificate;
}

//to_string
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll + ", qualification="
			+ qualification + ", year=" + year + ", certificate=" + certificate + "]";
}


	
	
}
