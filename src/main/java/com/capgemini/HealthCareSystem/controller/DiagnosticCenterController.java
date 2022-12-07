package com.capgemini.HealthCareSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.HealthCareSystem.ResourceNotFoundException;
import com.capgemini.HealthCareSystem.modal.Appointment;
import com.capgemini.HealthCareSystem.modal.DiagnosticCenter;
import com.capgemini.HealthCareSystem.modal.DiagnosticTest;
import com.capgemini.HealthCareSystem.services.AppointmentService;
import com.capgemini.HealthCareSystem.services.DiagnosticCenterService;
import com.capgemini.HealthCareSystem.services.DiagnosticTestService;


@RestController
@RequestMapping("diagnostic center")
public class DiagnosticCenterController {
	@Autowired(required = true)
	DiagnosticCenterService diagnosticCenterService;
	//private DiagnosticCenterService diagnosticCenterService;
	
	
	private DiagnosticCenterService DiagnosticCenterService;
	private AppointmentService appointmentService;
	
	//Adding DiagnosticCenetr
	
	
	@PostMapping("/add")                                  
	public ResponseEntity<DiagnosticCenter> addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter){
		DiagnosticCenter newDiagnosticCenter = diagnosticCenterService.addDiagnosticCenter(diagnosticCenter);
		return new ResponseEntity<>(newDiagnosticCenter, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/find/{id}")
	public DiagnosticCenter findDiagnosticCenterById(@PathVariable Integer id)
			throws ResourceNotFoundException {
		return diagnosticCenterService.findDiagnosticCenterById(id);
	}
	
	
	//search by name
	@GetMapping("/get/{name}")
	public DiagnosticCenter getDiagnosticCenterByName(@PathVariable String name) {
		return diagnosticCenterService.getDiagnosticCenterByName(name);
	}
	
	
	//upadting
	@PutMapping("/update")
	public ResponseEntity<DiagnosticCenter> updateDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) 
			throws ResourceNotFoundException{
		DiagnosticCenter updateDiagnosticCenter= diagnosticCenterService.updateDiagnosticCenter(diagnosticCenter);
		return new ResponseEntity<>(updateDiagnosticCenter,HttpStatus.OK);
	}
	
	/*//view part
	@GetMapping("/find/{Id}")
	public DiagnosticTest viewDiagnosticTest(@PathVariable int id) {
		return null;
		
	}*/
	
	//handler method
	@GetMapping("/DiagnosticCenter")
	public String listDiagnosticCenter(Model model) {
		model.addAttribute("diagnosticCenter",diagnosticCenterService.getAllDiagnosticCenter());
		return "DiagnosticCenter";
		
	}
	
	//remove 
	@DeleteMapping("/remove/{id}")                                  
	public ResponseEntity<?> removeDiagnosticCenter(@PathVariable("id") int id)
			throws ResourceNotFoundException{
		diagnosticCenterService.removeDiagnosticCenter(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//List
	@GetMapping("/all")
	public ResponseEntity<List<Appointment>> getAllAppointment(){
		List<Appointment> appointment = appointmentService.findAllAppointment();
		return new ResponseEntity<>(appointment, HttpStatus.OK);
	}

}
