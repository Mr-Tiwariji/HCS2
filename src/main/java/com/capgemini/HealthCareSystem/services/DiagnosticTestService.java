package com.capgemini.HealthCareSystem.services;

import java.util.List;

import com.capgemini.HealthCareSystem.modal.DiagnosticTest;

public interface DiagnosticTestService {
	public List<DiagnosticTest> getAllTest();
	public DiagnosticTest addNewTest(DiagnosticTest test);
	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId);
	public DiagnosticTest updateTestDetails(DiagnosticTest test);
	public DiagnosticTest removeTestFormDiagnosticCenter(int centerId,DiagnosticTest test);
	public void removeDiagnosticTest(int id);
	public DiagnosticTest updateDiagnosticTest(DiagnosticTest diagnosticTest);
	public DiagnosticTest findDiagnosticTestById(Integer id);
	public DiagnosticTest addTest(DiagnosticTest test);

}
