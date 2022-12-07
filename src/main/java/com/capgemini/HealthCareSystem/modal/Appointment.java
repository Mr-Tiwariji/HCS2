package com.capgemini.HealthCareSystem.modal;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ElementCollection
	private Set<DiagnosticTest> diagnosticTests;
	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;
	private LocalDate appointmentDate;
	//private ApprovalStatus approvalStatus;
	@ElementCollection
	private Set<TestResult> testResult;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<DiagnosticTest> getDiagnosticTests() {
		return diagnosticTests;
	}
	public void setDiagnosticTests(Set<DiagnosticTest> diagnosticTests) {
		this.diagnosticTests = diagnosticTests;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Set<TestResult> getTestResult() {
		return testResult;
	}
	public void setTestResult(Set<TestResult> testResult) {
		this.testResult = testResult;
	}
	public Appointment() {
		
	}
	public Appointment(int id, Set<DiagnosticTest> diagnosticTests, Patient patient, LocalDate appointmentDate,
			Set<TestResult> testResult) {
		super();
		this.id = id;
		this.diagnosticTests = diagnosticTests;
		this.patient = patient;
		this.appointmentDate = appointmentDate;
		this.testResult = testResult;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", diagnosticTests=" + diagnosticTests + ", patient=" + patient
				+ ", appointmentDate=" + appointmentDate + ", testResult=" + testResult + "]";
	}
	
	

}
