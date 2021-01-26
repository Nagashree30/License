package com.xworkz;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import com.xworkz.constants.BloodGroup;
	import com.xworkz.constants.Gender;
	import com.xworkz.constants.IdProof;
	import com.xworkz.constants.VehicleType;
	import com.xworkz.DAO.LicenseDAO;
	import com.xworkz.DAO.LicenseDAOImpl;
	import com.xworkz.DTO.AddressDTO;
	import com.xworkz.DTO.LicenseDTO;

	public class LicenseTester {

		public static void main(String[] args) {

			AddressDTO addressDTO = new AddressDTO(3254, "NA", 560003, "Soundatti", "Soundatti", "Ka", "Na");

			Date dob = new Date();
			SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
			try {
				dob=format.parse("16/10/1997");
			} catch (ParseException e) {
				e.printStackTrace();
			}

			LicenseDTO dto = new LicenseDTO("Soubhagya", 23, addressDTO, dob, 8884923476l, BloodGroup.AB_POSITIVE,
					Gender.FEMALE);
			dto.setIdProof(IdProof.AADHAR);
			dto.setIdProofNo("6363 8787 6449");
			dto.setCommercial(false);
			dto.setDisablity(false);
			dto.setStartdate(new Date());// change to future
			dto.setVehicleType(VehicleType.TWO_WHEELER);

			LicenseDAO dao = new LicenseDAOImpl();
			dao.save(dto);// DAO
				
			LicenseDTO dtoFound = dao.findByIdProofNo("6363 8787 6449");
			System.out.println(dtoFound);

			boolean updated=dao.updateVehicleTypeByIdProofNo("6363 8787 6449", VehicleType.LMV);
			System.out.println("updated "+ updated);
			
			
			LicenseDTO dtoafterUpdate=dao.findByIdProofNo("6363 8787 6449");
			System.out.println(dtoafterUpdate);
		}
	}


