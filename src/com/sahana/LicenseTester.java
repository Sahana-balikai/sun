package com.sahana;

import java.util.Date;

import com.sahana.constants.BloodGroup;
import com.sahana.constants.Gender;
import com.sahana.constants.IdProof;
import com.sahana.constants.VehicleType;
import com.sahana.dao.LicenseDAO;
import com.sahana.dao.impl.LicenseDAOimpl;
import com.sahana.dto.AdressDTO;
import com.sahana.dto.CommonDTO;
import com.sahana.dto.LicenseDTO;

public class LicenseTester {
public static void main(String[] args) {
		
		AdressDTO dto=new AdressDTO("sapna", "NA", 1356, "shrisai", "hubli", "KA", 581118);
		System.out.println(dto);
		
		
		Date date=new Date();
		CommonDTO commonDTO=new CommonDTO("Sahana", 22, date, 8105290224l, BloodGroup.A_POSITIVE, Gender.FEMALE);
		System.out.println(commonDTO);
		
		
		LicenseDTO licenseDTO=new LicenseDTO();
		licenseDTO.setIdProof(IdProof.ADHARCARD);
		licenseDTO.setIdProofNo("868834154111");
		licenseDTO.setType(VehicleType.TWO_WHEELER);
		licenseDTO.setDisability(false);
		licenseDTO.setCommercial(false);
		System.out.println(licenseDTO);
		
	    LicenseDAO dao= new LicenseDAOimpl();
	    dao.save(licenseDTO);
	    
	    
	   LicenseDTO dtoFound= dao.findByIdProof("868834154111");
       System.out.println(dtoFound);
       
       boolean updated=dao.updateVehicleTypeByIfProof("868834154111", VehicleType.LMV);
       System.out.println("updated"+updated );
       
       LicenseDTO dtoafterupdate=dao.findByIdProof("868834154111");
       System.out.println(dtoafterupdate);

}
}
