package com.sahana.dao;

import com.sahana.constants.VehicleType;
import com.sahana.dto.LicenseDTO;

public interface LicenseDAO {
	public void save(LicenseDTO dto);

	LicenseDTO findByIdProof(String idProofno);
	
	boolean updateVehicleTypeByIfProof(String idProof,VehicleType type);
    
	boolean deleteByIdProof(String idProof);
}
