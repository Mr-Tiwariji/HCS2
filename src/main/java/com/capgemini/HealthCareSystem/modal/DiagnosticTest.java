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
@Table(name = "Diagnostic_Test")
public class DiagnosticTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Test_Name",nullable=false)
	private String testName;
	
	@Column(name="Test_Price")
	private double testPrice;
	
	@Column(name="Normal_Value")
	private String normalvalue;
	
	@Column(name="Units")
	private String units;
	
	@ElementCollection
	private Set<DiagnosticCenter> diagnosticCenter;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public double getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}
	public String getNormalvalue() {
		return normalvalue;
	}
	public void setNormalvalue(String normalvalue) {
		this.normalvalue = normalvalue;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Set<DiagnosticCenter> getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(Set<DiagnosticCenter> diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
	@Override
	public String toString() {
		return "DiagnosticTest [id=" + id + ", testName=" + testName + ", testPrice=" + testPrice + ", normalvalue="
				+ normalvalue + ", units=" + units + ", diagnosticCenter=" + diagnosticCenter + "]";
	}
	
public DiagnosticTest() {
		
	}

	public DiagnosticTest(int id, String testName, double testPrice, String normalvalue, String units,
			Set<DiagnosticCenter> diagnosticCenter) {
		super();
		this.id = id;
		this.testName = testName;
		this.testPrice = testPrice;
		this.normalvalue = normalvalue;
		this.units = units;
		this.diagnosticCenter = diagnosticCenter;
	}
	public DiagnosticCenter updateDiagnosticTest(DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
