package com.sahana.dto;

import com.sahana.constants.IdProof;
import com.sahana.constants.VehicleType;

public class LicenseDTO extends CommonDTO{
	private IdProof idProof;
	private String idProofNo;
	private VehicleType type;
	private boolean disability;
	private boolean commercial;
	
	public LicenseDTO() {
		System.out.println("invoked licenseDto");
	}

	public LicenseDTO(IdProof idProof, String idProofNo, VehicleType type, boolean disability, boolean commercial) {
		super();
		this.idProof = idProof;
		this.idProofNo = idProofNo;
		this.type = type;
		this.disability = disability;
		this.commercial = commercial;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			System.out.println("object is null");
			return false;
		}
		if(obj instanceof LicenseDTO) {
			LicenseDTO converted=(LicenseDTO)obj;
			if(this.idProofNo!=null&&this.idProofNo.equals(converted.getIdProof()));
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", idProofNo=" + idProofNo + ", type=" + type + ", disability="
				+ disability + ", commercial=" + commercial + "]";
	}

	public IdProof getIdProof() {
		return idProof;
	}

	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

}
