package com.capgemini.HealthCareSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.capgemini.HealthCareSystem.modal.Appointment;
import com.capgemini.HealthCareSystem.modal.Patient;
@ComponentScan
@SpringBootApplication
public class HealthCareSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemApplication.class, args);
		
//		Appointment appointment=new Appointment();
//		appointment.setId(2);
//		
//		
//		
//		Patient patient=new Patient();
//		appointment.setPatient(patient);
//		patient.setName("Ravi");
//		patient.setAge(23);
//		patient.setGender("Male");
//		patient.setPhoneNo("8908082136");
//		patient.setPatientId(2);
//		//patient.setAppoitment(appointment);
	
	}

}
