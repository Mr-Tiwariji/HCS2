package com.capgemini.HealthCareSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.HealthCareSystem.modal.TestResult;

@Repository
public interface TestRepository extends JpaRepository<TestResult, Integer>{

}
