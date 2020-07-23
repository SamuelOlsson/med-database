package com.claim.MedicalDatabase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.claim.MedicalDatabase.model.Patient;
import com.claim.MedicalDatabase.repository.PatientRepository;

public class PatientServiceImpl implements PatientService{



private PatientRepository patientRepository;
	
	
	@Autowired
	public PatientServiceImpl(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	
	@Override
	public List<Patient> findByDoctorEmail(String docEmail) {
		// TODO Auto-generated method stub
		return patientRepository.findByDoctorEmail(docEmail);
	}
	

	@Override
	public Patient findByPatientLastName(String lname) {
		// TODO Auto-generated method stub
		return patientRepository.findByPatientLastName(lname);
	}

	@Override
	public List<Patient> findbyO2Levels(double o2Level) {
		// TODO Auto-generated method stub
		return patientRepository.findByPatientO2_Level(o2Level);
	}

	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public List<Patient> findByHeartbeat(double heartbeat) {
		// TODO Auto-generated method stub
		return patientRepository.findByPatientHeartbeat(heartbeat);
	}

	@Override
	public Optional<Patient> findById(Long id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id);
	}

	@Override
	public void save(Patient patient) {
		// TODO Auto-generated method stub
		patientRepository.save(patient);
	}

	@Override
	public List<Patient> findByName(String name) {
		// TODO Auto-generated method stub
		return patientRepository.findByPatientName(name);
	}

	@Override
	public List<Patient> search(String keyword) {
		
		// TODO Auto-generated method stub
		List<Patient> patients = (List<Patient>) patientRepository.search(keyword);
		return patients;
	}

	@Override
	public List<Patient> getById(Long id) {
		// TODO Auto-generated method stub
		return patientRepository.getById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
	}

	@Override
	public List<Patient> findByRespiratoryRate(String respiratoryRate) {
		// TODO Auto-generated method stub
		return patientRepository.findByRespiratoryRate(respiratoryRate);
	}

	@Override
	public List<Patient> findByTemperature(String temperature) {
		// TODO Auto-generated method stub
		return patientRepository.findByTemperature(temperature);
	}

//	@Override
//	public List<Patient> findByBloodPressure(String bloodPressure) {
//		// TODO Auto-generated method stub
//		return patientRepository.findByBloodPressure(bloodPressure);
//	}
	
	

}
