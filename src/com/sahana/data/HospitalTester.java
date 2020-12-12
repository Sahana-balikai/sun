package com.sahana.data;
import com.sahana.data.dto.AppointmentDTO;
import com.sahana.data.dto.Hospital;

public class HospitalTester {
	public static void main(String[] args) {
		Hospital hospital=new Hospital("Victory","City Market");
		
		hospital.appointment("sahana", 8105290224l, 43, "heart problem", "Dr.sapna");
		
		AppointmentDTO appointment=hospital.getAppointmentDTO();
		System.out.println("patient name " +appointment.getPatientName());
		System.out.println("mobile number "+appointment.getMobileNumber());
		System.out.println("doctor name "+appointment.getDoctorName());
		

	}

}
