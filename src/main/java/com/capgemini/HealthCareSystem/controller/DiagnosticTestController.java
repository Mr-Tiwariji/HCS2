package com.capgemini.HealthCareSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.HealthCareSystem.ResourceNotFoundException;
import com.capgemini.HealthCareSystem.modal.Appointment;
import com.capgemini.HealthCareSystem.modal.DiagnosticCenter;
import com.capgemini.HealthCareSystem.modal.DiagnosticTest;
import com.capgemini.HealthCareSystem.services.DiagnosticCenterService;
import com.capgemini.HealthCareSystem.services.DiagnosticTestService;

@RestController
@RequestMapping("diagnostic_test")
public class DiagnosticTestController {
	@Autowired
	private DiagnosticTestService diagnosticTestService;
	
	
	//List of test
	@GetMapping("/all")
	public ResponseEntity<List<DiagnosticTest>> getAllTest(){
		List<DiagnosticTest> test = diagnosticTestService.getAllTest();
		return new ResponseEntity<>(test, HttpStatus.OK);
	}
	
	//Adding Test
	/*@PostMapping("/add")
	public String addDiagnosticTest(@RequestParam int id, @RequestParam String testName, @RequestParam double testPrice, @RequestParam String normalValue, @RequestParam String units) {
		DiagnosticTest diagnosticTest=new DiagnosticTest();
		diagnosticTest.setId(id);
		diagnosticTest.setTestName(testName);
		diagnosticTest.setTestPrice(testPrice);
		diagnosticTest.setNormalvalue(normalValue);
		diagnosticTest.setUnits(units);
		return "Added New Diagnostic Test";
	}*/
	
	@PostMapping("/add")                                  
	public ResponseEntity<DiagnosticTest> addTest(@RequestBody DiagnosticTest test)
		{
		DiagnosticTest newTest = diagnosticTestService.addTest(test);
		return new ResponseEntity<>(newTest, HttpStatus.CREATED);
	}
	
	//update
	@PutMapping("/update")
	public ResponseEntity<DiagnosticTest> updateDiagnosticTest(@RequestBody DiagnosticTest diagnosticTest) {
		DiagnosticTest updateDiagnosticTest= diagnosticTestService.updateDiagnosticTest(diagnosticTest);
		return new ResponseEntity<>(updateDiagnosticTest,HttpStatus.OK);
	}
	
	//find
	@GetMapping("/find/{id}")
	public ResponseEntity<DiagnosticTest> findDiagnosticTestById(@PathVariable("id") Integer id) 
			throws ResourceNotFoundException{
		DiagnosticTest diagnosticTest= diagnosticTestService.findDiagnosticTestById(id);
		return new ResponseEntity<>(diagnosticTest, HttpStatus.OK);
	}
	
	//Remove Test from DiagnosticCenter
	@DeleteMapping("/remove/{id}")                                  
	public ResponseEntity<?> removeDiagnosticCenter(@PathVariable("id") int id){
		diagnosticTestService.removeDiagnosticTest(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
