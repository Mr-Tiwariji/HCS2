package com.capgemini.HealthCareSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.HealthCareSystem.modal.DiagnosticTest;

@Repository
public interface DiagnosticTestRepository extends JpaRepository<DiagnosticTest,Integer>{
	DiagnosticTest findDiagnosticTestById(Integer id);

}
