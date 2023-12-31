package dao;

import java.util.List;

import entity.Appointment;

public interface IHospitalService {
	public Appointment getAppointment(int appointmentId);
	public List<Appointment> getAppointmentsForPatient(int patientId);
	public List<Appointment> getAppointmentsForDoctor(int doctorId);
	public boolean scheduleAppointment(Appointment appointment);
	public boolean updateAppointment(Appointment appointment);
	public boolean cancelAppointment(int appointmentId);
	
	
}
