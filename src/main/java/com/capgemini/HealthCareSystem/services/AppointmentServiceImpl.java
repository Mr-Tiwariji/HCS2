package com.capgemini.HealthCareSystem.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.HealthCareSystem.modal.Appointment;
import com.capgemini.HealthCareSystem.repository.AppoinmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	public AppoinmentRepository appointmentrepo;
	@Override
	public Appointment addAppointment(Appointment appointment) {
		return appointmentrepo.saveAndFlush(appointment);
	}

	@Override
	public Set<Appointment> viewAppointment(String patientName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment viewAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAppointmentList(int centreId, String test, int status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment removeAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> findAllAppointment() {
		// TODO Auto-generated method stub
		return appointmentrepo.findAll();
	}

	
	
	

}
