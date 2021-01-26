package com.xworkz.DAO;

import com.xworkz.constants.VehicleType;
import com.xworkz.DTO.LicenseDTO;

public interface LicenseDAO {

	void save(LicenseDTO dto);
	
	LicenseDTO findByIdProofNo(String idProofNo);
	
	boolean updateVehicleTypeByIdProofNo(String idProof,VehicleType type);
	
	boolean deleteByIdProofNo(String idPrrof);

	void save1(com.xworkz.DTO.LicenseDTO dto);
	
}
