package com.capgemini.HealthCareSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.HealthCareSystem.modal.Patient;

@Repository
public interface PatientRepository extends JpaRepository< Patient, Integer>{

}
