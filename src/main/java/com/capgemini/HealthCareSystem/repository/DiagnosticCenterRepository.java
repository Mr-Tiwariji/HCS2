package com.capgemini.HealthCareSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.capgemini.HealthCareSystem.modal.DiagnosticCenter;

@Repository
public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenter,Integer>{
	void removeDiagnosticCenterById(Integer id);
	DiagnosticCenter findDiagnosticCenterById(Integer id);
	DiagnosticCenter getDiagnosticCenterByName(String name);
	
}
