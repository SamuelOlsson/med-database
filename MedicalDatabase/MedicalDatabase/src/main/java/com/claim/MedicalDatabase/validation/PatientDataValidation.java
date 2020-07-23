package com.claim.MedicalDatabase.validation;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.claim.MedicalDatabase.model.Patient;




@Component
public class PatientDataValidation implements Validator {
	
	public boolean supports(Class<?> clazz) {
		return Patient.class.equals(clazz);
	}

	
	
	public void validate(Object o, Errors errors) {
		Patient patient = (Patient) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lname", "NotEmpty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fname", "NotEmpty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "docEmail", "NotEmpty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "o2Level", "NotEmpty");
		if (patient.getO2Level() < 0) {
			errors.rejectValue("o2_Level", "size.patient.o2Level");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "heartbeat", "NotEmpty");
		if (patient.getHeartbeat() < 0) {
			errors.rejectValue("heartbeat", "size.patient");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "systolicBloodPressure", "NotEmpty");
		if (patient.getHeartbeat() < 0) {
			errors.rejectValue("systolicBloodPressure", "size.patient");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "diastolicBloodPressure", "NotEmpty");
		if (patient.getHeartbeat() < 0) {
			errors.rejectValue("diastolicBloodPressure", "size.patient");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "temperature", "NotEmpty");
		if (patient.getHeartbeat() < 0) {
			errors.rejectValue("temperature", "size.patient");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "respiratoryRate", "NotEmpty");
		if (patient.getHeartbeat() < 0) {
			errors.rejectValue("respiratoryRate", "size.patient");
		}
}
	public void patientSearchValidate(String lname, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lname", "NotEmpty");
	}
}
