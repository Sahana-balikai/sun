package com.sahana.data.dto;

public class AppointmentDTO {
	private String patientName;
	private long mobileNumber;
	private int age;
	private String reason;
	private String doctorName;
	public AppointmentDTO(String patientName, long mobileNumber,String reason, int age, String doctorName) {
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.reason = reason;
		this.doctorName = doctorName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	

}
