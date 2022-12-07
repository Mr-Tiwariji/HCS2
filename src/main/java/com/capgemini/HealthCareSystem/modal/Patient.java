package com.capgemini.HealthCareSystem.modal;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="Patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name = "phoneNo")
	private String phoneNo;
	
	@Column(name="age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@ElementCollection
	private Set<Appointment> appointment;
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Set<Appointment> getAppointment() {
		return appointment;
	}
	public void setAppoitment(Set<Appointment> appoitment) {
		this.appointment = appoitment;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", phoneNo=" + phoneNo + ", age=" + age
				+ ", gender=" + gender +", appointment="
						+ appointment + "]";
	}
	
	public Patient() {
	
	}
	public Patient(int patientId, String name, String phoneNo, int age, String gender, Set<Appointment> appoitment) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
		this.gender = gender;
		this.appointment = appoitment;
	}
	
	

}
