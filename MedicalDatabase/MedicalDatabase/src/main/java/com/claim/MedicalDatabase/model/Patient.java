package com.claim.MedicalDatabase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="patient_id")
	private long id;
	
	@Column(name="physician_email")
	private String docEmail;
	
	
	
	@Column(name="last_name")
	private String lname;
	
	@Column(name="first_name")
	private String fname;
	
	@Column(name="o2_level")
	private double o2Level;
	
	@Column(name="heartbeat")
	private double heartbeat;
	
	@Column(name="respiratory_rate")
	private double respiratoryRate;
	
	@Column(name="temp")
	private double temperature;
	
	@Column(name="systolic_blood_pressure")
	private double systolicBloodPressure;
	
	@Column(name="diastolic_blood_pressure")
	private double diastolicBloodPressure;
	
	@Column(name="role")
	private String role;
	
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getHeartbeat() {
		return heartbeat;
	}
	public void setHeartbeat(double heartbeat) {
		this.heartbeat = heartbeat;
	}

	public String getDocEmail() {
		return docEmail;
	}
	public void setDocEmail(String docEmail) {
		this.docEmail = docEmail;
	}
	
	public double getRespiratoryRate() {
		return respiratoryRate;
	}
	public void setRespiratoryRate(double respiratoryRate) {
		this.respiratoryRate = respiratoryRate;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getSystolicBloodPressure() {
		return systolicBloodPressure;
	}
	public void setSystolicBloodPressure(double systolicBloodPressure) {
		this.systolicBloodPressure = systolicBloodPressure;
	}
	public double getDiastolicBloodPressure() {
		return diastolicBloodPressure;
	}
	public void setDiastolicBloodPressure(double diastolicBloodPressure) {
		this.diastolicBloodPressure = diastolicBloodPressure;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}


	
	public double getO2Level() {
		return o2Level;
	}
	public void setO2Level(double o2Level) {
		this.o2Level = o2Level;
	}
	
	
	public String vitalSigns(){
		return "Patient Vital Signs:\n" + "Heart Rate: " + heartbeat + "\nO2 Saturation Levels: " + o2Level 
				+ "\nTemperature: " + temperature + " \nRespiratory Rate: " + respiratoryRate + "\nSystolic Blood Pressure: " + systolicBloodPressure
				+ "\nDiastolic Blood Pressure: " + diastolicBloodPressure;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", docEmail=" + docEmail + ", lname=" + lname + ", fname=" + fname + ", o2Level="
				+ o2Level + ", heartbeat=" + heartbeat + ", respiratoryRate=" + respiratoryRate + ", temperature="
				+ temperature + ", systolicBloodPressure=" + systolicBloodPressure + ", diastolicBloodPressure="
				+ diastolicBloodPressure + ", role=" + role + "]";
	}
}
