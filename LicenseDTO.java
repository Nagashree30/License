package com.xworkz.DTO;

import java.util.Date;

import com.xworkz.constants.BloodGroup;
import com.xworkz.constants.Gender;
import com.xworkz.constants.IdProof;
import com.xworkz.constants.VehicleType;

public class LicenseDTO extends CommonDTO {

	private IdProof idProof;
	private String idProofNo;
	private VehicleType vehicleType;
	private Date startdate;
	private boolean disablity;
	private boolean commercial;

	public LicenseDTO() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param addressDTO
	 * @param dOB
	 * @param mobileNo
	 * @param bloodGroup
	 * @param gender
	 */
	public LicenseDTO(String name, int age, AddressDTO addressDTO, Date dOB, long mobileNo, BloodGroup bloodGroup,
			Gender gender) {
		super(name, age, addressDTO, dOB, mobileNo, bloodGroup, gender);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is null");
			return false;
		}
		if (obj instanceof LicenseDTO) {
			LicenseDTO converted = (LicenseDTO) obj;

			if (this.idProofNo != null && this.idProofNo.equals(converted.getIdProofNo())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", idProofNo=" + idProofNo + ", vehicleType=" + vehicleType
				+ ", startdate=" + startdate + ", disablity=" + disablity + ", commercial=" + commercial + "]";
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

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public boolean isDisablity() {
		return disablity;
	}

	public void setDisablity(boolean disablity) {
		this.disablity = disablity;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

}
