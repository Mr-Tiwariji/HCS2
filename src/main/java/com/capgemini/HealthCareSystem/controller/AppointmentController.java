package com.capgemini.HealthCareSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.HealthCareSystem.modal.Appointment;
import com.capgemini.HealthCareSystem.services.AppointmentServiceImpl;

@Controller
public class AppointmentController {
	
	@Autowired
	public AppointmentServiceImpl appointmentService;
	@PostMapping("/addappointment")
	public Appointment addAppointment(Appointment appointment) {
		System.out.println("appointment");
		return appointmentService.addAppointment(appointment);
		
	}
	
}

	