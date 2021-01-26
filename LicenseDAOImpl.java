package com.xworkz.DAO;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.constants.VehicleType;
import com.xworkz.DAO.LicenseDAO;
import com.xworkz.DTO.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {

	private List<LicenseDTO> database;

	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo:" + idProofNo);
		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();
			if (idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProof:" + idProof);
		System.out.println("type:" + type);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update , license is found");
			dtoFromDB.setVehicleType(type);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;

	}

	@Override
	public boolean deleteByIdProofNo(String idPrrof) {
		return false;
	}

	@Override
	public void save1(LicenseDTO dto) {
		
	}
}