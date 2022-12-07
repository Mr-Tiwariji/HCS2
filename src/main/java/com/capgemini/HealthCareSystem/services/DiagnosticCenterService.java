package com.capgemini.HealthCareSystem.services;

import java.util.List;

import com.capgemini.HealthCareSystem.modal.DiagnosticCenter;

public interface DiagnosticCenterService {
	
	//public DiagnosticCenter insertDiagnosticCenter()
	public List<DiagnosticCenter> getAllDiagnosticCenter();

	public DiagnosticCenter findDiagnosticCenterById(Integer id);

	public void removeDiagnosticCenter(int id);

	public DiagnosticCenter getDiagnosticCenterByName(String name);

	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter);

	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	
	//public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);

}
