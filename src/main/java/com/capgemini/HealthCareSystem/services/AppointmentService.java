package com.capgemini.HealthCareSystem.services;

import java.util.List;
import java.util.Set;

import com.capgemini.HealthCareSystem.modal.Appointment;

public interface AppointmentService {
	public Appointment addAppointment(Appointment appointment);
	public Set<Appointment> viewAppointment(String patientName);
	public Appointment viewAppointment(int appointmentId);
	public Appointment updateAppointment(Appointment appointment);
	public List<Appointment>getAppointmentList(int centreId,String test,int status);
	public Appointment removeAppointment(Appointment appointment);
	public List<Appointment> findAllAppointment();

}
