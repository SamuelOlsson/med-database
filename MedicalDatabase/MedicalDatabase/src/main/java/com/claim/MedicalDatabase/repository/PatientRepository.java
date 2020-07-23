package com.claim.MedicalDatabase.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.claim.MedicalDatabase.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

	@Query("FROM Patient WHERE fname=?1 or lname=?1")
	List<Patient> findByPatientName(String name);
	
	@Query("FROM Patient WHERE lname=?1")
	Patient findByPatientLastName(String lname);
	
	@Query("FROM Patient WHERE o2_Level=?1")
	List<Patient> findByPatientO2_Level(double o2Level);
	
	@Query("FROM Patient WHERE heartbeat=?1")
	List<Patient> findByPatientHeartbeat(double heartbeat);
	
	@Query("FROM Patient WHERE physician_email=?1")
	List<Patient> findByDoctorEmail(String docEmail);
	
	@Query("FROM Patient WHERE temperature=?1")
	List<Patient> findByTemperature(String temperature);
	
//	@Query("FROM Patient WHERE systolic_blood_pressure=?1")
//	List<Patient> findBySystolicBloodPressure(String systolicBloodPressure);
//	
//	@Query("FROM Patient WHERE systolic_blood_pressure=?1")
//	List<Patient> findBySystolicBloodPressure(String systolicBloodPressure);
	
	@Query("FROM Patient WHERE respiratory_rate=?1")
	List<Patient> findByRespiratoryRate(String respiratoryRate);
	
	@Query("SELECT p FROM Patient p WHERE p.fname LIKE '%' || :keyword || '%'"
            + " OR p.lname LIKE '%' || :keyword || '%'")
	public List<Patient> search(@Param("keyword") String keyword);
	
	@Query("FROM Patient WHERE id=?1")
	List<Patient> getById(Long id);
}
