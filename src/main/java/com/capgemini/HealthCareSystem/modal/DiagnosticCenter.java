package com.capgemini.HealthCareSystem.modal;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Diagnostic_Center")
public class DiagnosticCenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="Contact_No")
	private String contactNo;
	@Column(name="Address")
	private String address;
	@Column(name="Email")
	private String contactEmail;
	@ElementCollection
	private List<String> serviceOffered;
	@ElementCollection
	private Set<DiagnosticTest> tests;
	
	
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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public List<String> getServiceOffered() {
		return serviceOffered;
	}
	public void setServiceOffered(List<String> serviceOffered) {
		this.serviceOffered = serviceOffered;
	}
	public Set<DiagnosticTest> getTests() {
		return tests;
	}
	public void setTests(Set<DiagnosticTest> tests) {
		this.tests = tests;
	}
	
	
	@Override
	public String toString() {
		return "DiagnosticCenter [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address
				+ ", contactEmail=" + contactEmail + ", serviceOffered=" + serviceOffered + ", tests=" + tests + "]";
	}
	
public DiagnosticCenter() {
		
	}
	public DiagnosticCenter(int id, String name, String contactNo, String address, String contactEmail,
			List<String> serviceOffered, Set<DiagnosticTest> tests) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.contactEmail = contactEmail;
		this.serviceOffered = serviceOffered;
		this.tests = tests;
	}
	/*public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
}
