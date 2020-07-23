package com.claim.MedicalDatabase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.claim.MedicalDatabase.model.Patient;

public interface PatientService {

	Patient findByPatientLastName(String lname);
	
	List<Patient> findbyO2Levels(double o2Level);
	
	List<Patient> findAll();
	
	List<Patient> findByHeartbeat(double heartbeat);
	
	List<Patient> findByDoctorEmail(String docEmail);
	
	List<Patient> findByName(String name);
	
	List<Patient> findByRespiratoryRate(String respiratoryRate);
	
	List<Patient> findByTemperature(String temperature);
	
	//List<Patient> findByBloodPressure(String bloodPressure);
	
	Optional<Patient> findById(Long id);
	 
	List<Patient> search(String keyword);
	
	List<Patient> getById(Long id);
	
	void save(Patient patient);
	
	void delete(Long id);
	
}
