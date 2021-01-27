package com.sahana.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sahana.constants.VehicleType;
import com.sahana.dao.LicenseDAO;
import com.sahana.dto.LicenseDTO;

public class LicenseDAOimpl implements LicenseDAO {

	private List<LicenseDTO> database;

	public LicenseDAOimpl() {

		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoke save in license dao impl method");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved) {
			System.out.println("dto is saved");
		} else {
			System.out.println("dto is not saved");
		}

	}

	@Override
	public LicenseDTO findByIdProof(String idProofno) {
		System.out.println("invoked findByIdProof");
		System.out.println("idProofno:" + idProofno);
		// LicenseDTO dummy=null;
		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();
			if (idProofFromDTO.equals(idProofno)) {
				System.out.println("license found");
				// dummy=licenseDTO;
				return licenseDTO;

			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIfProof(String idProof, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIfProof");
		System.out.println("idProof" + idProof);
		System.out.println("type:" + type);
		LicenseDTO dtoFromDB = this.findByIdProof(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update, License is found");
			dtoFromDB.setType(type);
			return true;
		} else {
			System.out.println("cannot update,License not found");
		}
		return false;
	}

	@Override
	public boolean deleteByIdProof(String idProof) {
		System.out.println("invoked deleteByIdProofNo");
		System.out.println("idproof "+idProof);
		LicenseDTO idProofFromDB = this.findByIdProof(idProof);
		Iterator<LicenseDTO> iterator=this.database.iterator();
		while(iterator.hasNext()) {
			LicenseDTO dto=iterator.next();
			if(dto.getIdProofNo().equals(idProof)) {
				iterator.remove();
	            System.out.println("idproof no deleted");
				return true;
			}else {
				System.out.println("idproof no not found");
			}
		}
		return false;
	}

}
