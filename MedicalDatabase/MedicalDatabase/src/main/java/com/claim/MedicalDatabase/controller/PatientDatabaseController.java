package com.claim.MedicalDatabase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.claim.MedicalDatabase.Utils.EmailSender;
import com.claim.MedicalDatabase.model.Patient;
import com.claim.MedicalDatabase.model.Users;
import com.claim.MedicalDatabase.repository.PatientRepository;
import com.claim.MedicalDatabase.validation.PatientDataValidation;

@Controller 
@SessionAttributes("loggedInUser")
public class PatientDatabaseController {
	
	@Autowired
	private EmailSender emailSender;
	
	@Autowired
	private PatientDataValidation validation;
	
	private PatientRepository patientRepository;
	
	public PatientDatabaseController(PatientDataValidation validation, PatientRepository patientRepository) {
		super();
		this.validation = validation;
		this.patientRepository = patientRepository;
		
	}

	@GetMapping("patientDatabase")
	public String patientDatabase() {
		return "patientDatabase";
	}
	
	@GetMapping("addToPatientDatabase")
	public String addToPatientDatabase(Model model) {
		model.addAttribute("msg", "Add New Patient Data");
		model.addAttribute("hidden", "");
		model.addAttribute("patient", new Patient());
		model.addAttribute("action", "addToPatientDatabase");
		return "addToPatientDatabase";
	}
	
	@PostMapping("addToPatientDatabase")
	public String updatePatientDatabase(@ModelAttribute Patient patient, BindingResult result, Model model) {
		
		try {
			validation.validate(patient, result);
			if (result.hasErrors()) {
				model.addAttribute("error", "Required* fields");
				model.addAttribute("hidden", "");
				model.addAttribute("action", "register");
				return "addToPatientDatabase";
			}
			
			patientRepository.save(patient);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(patient.getO2Level() < 95) {
			emailSender.sendMail(patient.getDocEmail(), patient.vitalSigns(), patient.getLname() +"'s 02 Levels are out of healthy range");
		}
		if(patient.getHeartbeat() < 40 || patient.getHeartbeat() > 100) {
			emailSender.sendMail(patient.getDocEmail(), patient.vitalSigns() , patient.getLname() + "'s Heart Rate is out of healthy range");
		}
		return "patientDatabase";
		
	}
	
	@GetMapping("viewPatientData")
	public String viewPatientData(Patient patient, Model model) {
		List<Patient> patients = patientRepository.findAll();
		model.addAttribute("total", patients);
		return "viewPatientData";
	}
	
	@GetMapping("/viewPatientDataSucess")
	public String search(Model model, @RequestParam String keyword) {
	    List<Patient> patients =patientRepository.search(keyword);
	    model.addAttribute("result", patients);
	 
	    return "viewPatientDataSucess";    
	}
	
	@GetMapping("editPatientData")
	public String editPatientData(Model model, @RequestParam Long id) {
		model.addAttribute("patient.id", id);
		return "editPatientData";
	}
	
	@PostMapping("editPatientData")
	public String saveEditedPatientData(@ModelAttribute Patient patient, BindingResult result, Model model) {
		try {
			validation.validate(patient, result);
			if (result.hasErrors()) {
				model.addAttribute("error", "Required* fields");
				
				return "viewPatientData";
			}
			
			patientRepository.save(patient);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(patient.getO2Level() < 95) {
			emailSender.sendMail(patient.getDocEmail(), patient.vitalSigns(), patient.getLname() +"'s 02 Levels are out of healthy range");
		}
		if(patient.getHeartbeat() < 40 || patient.getHeartbeat() > 100) {
			emailSender.sendMail(patient.getDocEmail(), patient.vitalSigns(), patient.getLname() + "'s Heart Rate is out of healthy range");
		}
		if(patient.getSystolicBloodPressure() < 90 || patient.getSystolicBloodPressure() > 120) {
			emailSender.sendMail(patient.getDocEmail(), patient.vitalSigns(), patient.getLname() + "'s Systolic Blood Pressure is out of healthy range");
		}
		if(patient.getDiastolicBloodPressure() < 60 || patient.getDiastolicBloodPressure() > 80) {
			emailSender.sendMail(patient.getDocEmail(), patient.vitalSigns(), patient.getLname() + "'s Diastolic Blood Pressure is out of healthy range");
		}
		if(patient.getTemperature() < 97 || patient.getTemperature() > 99) {
			emailSender.sendMail(patient.getDocEmail(), patient.vitalSigns(), patient.getLname() + "'s Temperature is out of healthy range");
		}
		if(patient.getRespiratoryRate() < 12 || patient.getRespiratoryRate() > 16) {
			emailSender.sendMail(patient.getDocEmail(), patient.vitalSigns(), patient.getLname() + "'s Respiratory Rate is out of healthy range");
		}
		
		return "patientDatabase";
	}
	
	@GetMapping("deletePatientData")
	public String deletePatientData(Model model, @RequestParam Long id) {
		patientRepository.deleteById(id);
		List<Patient> patients = patientRepository.findAll();
		model.addAttribute("total", patients);
		return "viewPatientData";
	}
	

	
	
	
	
	@ModelAttribute("patient")
	Patient patient() {
		return new Patient();
	}
}
