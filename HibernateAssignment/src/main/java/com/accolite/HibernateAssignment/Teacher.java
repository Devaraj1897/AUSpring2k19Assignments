package com.accolite.HibernateAssignment;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Teacher {
	@Id
	@GeneratedValue
	private int teacherId;
	private String teacherName;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private SubjectsInSchool teacherSubjectId;
	private int phoneNumber;
	private String address;
	@ElementCollection
	private List<Student> studentsHandling;
	
	
	
	public List<Student> getStudentsHandling() {
		return studentsHandling;
	}



	public void setStudentsHandling(List<Student> studentsHandling) {
		this.studentsHandling = studentsHandling;
	}



	public Teacher() {
		super();
	}
	
	
	
	public Teacher(int teacherId, String teacherName, SubjectsInSchool teacherSubjectId, int phoneNumber, String address) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherSubjectId = teacherSubjectId;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSubjectId="
				+ teacherSubjectId + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public SubjectsInSchool getTeacherSubjectId() {
		return teacherSubjectId;
	}
	public void setTeacherSubjectId(SubjectsInSchool teacherSubjectId) {
		this.teacherSubjectId = teacherSubjectId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
