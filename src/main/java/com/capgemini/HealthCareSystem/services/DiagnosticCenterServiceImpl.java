package com.capgemini.HealthCareSystem.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.HealthCareSystem.modal.DiagnosticCenter;
import com.capgemini.HealthCareSystem.repository.DiagnosticCenterRepository;

@Service
@Transactional
public class DiagnosticCenterServiceImpl implements DiagnosticCenterService{
	
	
	private final DiagnosticCenterRepository DiagnosticCenterRepo;
	@Autowired

	public DiagnosticCenterServiceImpl(DiagnosticCenterRepository diagnosticCenterRepo) {
		super();
		DiagnosticCenterRepo = diagnosticCenterRepo;
	}


	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenter() {
		// TODO Auto-generated method stub
		return DiagnosticCenterRepo.findAll();
	}


	@Override
	public DiagnosticCenter findDiagnosticCenterById(Integer id) {
		// TODO Auto-generated method stub
		return DiagnosticCenterRepo.findDiagnosticCenterById(id);
	}


	@Override
	public void removeDiagnosticCenter(int id) {
		// TODO Auto-generated method stub
		DiagnosticCenterRepo.removeDiagnosticCenterById(id);
		
	}


	@Override
	public DiagnosticCenter getDiagnosticCenterByName(String name) {
		// TODO Auto-generated method stub
		return DiagnosticCenterRepo.getDiagnosticCenterByName(name);
	}


	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return DiagnosticCenterRepo.save(diagnosticCenter);
	}
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return DiagnosticCenterRepo.save(diagnosticCenter);
	}

}
