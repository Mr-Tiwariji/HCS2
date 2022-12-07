package com.capgemini.HealthCareSystem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.HealthCareSystem.modal.DiagnosticTest;
import com.capgemini.HealthCareSystem.repository.DiagnosticTestRepository;

@Service
public class DiagnosticTestServiceImpl implements DiagnosticTestService{
	private DiagnosticTestRepository diagnosticTestRepo;
	@Override
	public List<DiagnosticTest> getAllTest() {
		// TODO Auto-generated method stub
		return diagnosticTestRepo.findAll();
	}

	@Override
	public DiagnosticTest addNewTest(DiagnosticTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticTest updateTestDetails(DiagnosticTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticTest removeTestFormDiagnosticCenter(int centerId, DiagnosticTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeDiagnosticTest(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DiagnosticTest updateDiagnosticTest(DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		return diagnosticTestRepo.save(diagnosticTest);
	}

	@Override
	public DiagnosticTest findDiagnosticTestById(Integer id) {
		// TODO Auto-generated method stub
		return diagnosticTestRepo.findDiagnosticTestById(id);
	}

	@Override
	public DiagnosticTest addTest(DiagnosticTest test) {
		// TODO Auto-generated method stub
		
		return diagnosticTestRepo.save(test);
	}
	
}
