/**
 * 
 */
package com.medicineapp.service;

import java.time.LocalDate;
import java.util.HashSet;
/**
 * @author TharunyaREDDY
 * 
 */
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicineapp.exception.MedicineNotFoundException;
import com.medicineapp.model.Brand;
import com.medicineapp.model.Category;
import com.medicineapp.model.Description;
import com.medicineapp.model.Medicine;
import com.medicineapp.repository.IMedicineRepository;

/**
 * @author TharunyaREDDY
 *
 */
@Service
public class MedicineServiceImpl implements IMedicineService {

	@Autowired
	IMedicineRepository medicineRepository;

	 // To add medicines
	@Override
	public Medicine addMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	// To update medicine
	@Override
	public void updateMedicine(Medicine medicine) {
		medicineRepository.save(medicine);
	}

	// To delete Medicine By Medicine Id
	@Override
	public void deleteMedicine(int medicineId) throws MedicineNotFoundException {
		medicineRepository.findById(medicineId)
				.orElseThrow(() -> new MedicineNotFoundException("No Medicine Found,Invalid Id"));
		medicineRepository.deleteById(medicineId);
	}

	// To get All Medicines
	@Override
	public List<Medicine> getAll() throws MedicineNotFoundException {

		List<Medicine> allMedicines = medicineRepository.findAll();
		if (allMedicines.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines");
		}
		return allMedicines;
	}

	// To get Medicine By Medicine Id
	@Override
	public Medicine getById(int medicineId) throws MedicineNotFoundException {
		return medicineRepository.findById(medicineId)
				.orElseThrow(() -> new MedicineNotFoundException("No Medicine Found,Invalid Id"));
	}

	 //To get Medicine By Medicine Name
	@Override
	public List<Medicine> getByMedicineName(String medicineName) throws MedicineNotFoundException{

		List<Medicine> medicinesByName = medicineRepository.findByMedicineName(medicineName);
		if (medicinesByName.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines found by name");
		}
		return medicinesByName;
	}

	// To get Medicine By Medicine Type
	@Override
	public List<Medicine> getByMedicineType(String medicineType) throws MedicineNotFoundException{
		List<Medicine> medicinesByType = medicineRepository.findByMedicineType(medicineType);
		if (medicinesByType.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines by type");
		}
		return medicinesByType;
	}
	
	// To get Medicine By Manufacture Date
	@Override
	public List<Medicine> getByManufactureDate(LocalDate manufactureDate) throws MedicineNotFoundException{
		List<Medicine> medicinesByManufactureDate = medicineRepository.findByManufactureDate(manufactureDate);
		if (medicinesByManufactureDate.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines by date");
		}
		return medicinesByManufactureDate;
	}

	// To get Medicine By Expiry Date
	@Override
	public List<Medicine> getByExpiryDate(LocalDate expiryDate) throws MedicineNotFoundException{
		List<Medicine> medicinesByExpiryDate = medicineRepository.findByExpiryDate(expiryDate);
		if (medicinesByExpiryDate.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines by date");
		}
		return medicinesByExpiryDate;
	}
	

	// To get Medicine By Medicine Name And Medicine Type
	@Override
	public List<Medicine> getByMedicineNameAndMedicineType(String medicineName, String medicineType) throws MedicineNotFoundException{
		List<Medicine> medicinesByNameAndType = medicineRepository.findByMedicineNameAndMedicineType(medicineName, medicineType);
		if (medicinesByNameAndType.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines by type and name");
		}
		return medicinesByNameAndType;
	}
	
	// To get Medicine By Medicine Name And Category Name
	@Override
	public List<Medicine> getByMedicineNameAndCategoryName(String medicineName, String categoryName)
			throws MedicineNotFoundException {
		
		List<Medicine> medicinesByNameAndCategory = medicineRepository.findByMedicineNameAndCategoryName(medicineName, categoryName);
		if (medicinesByNameAndCategory.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines by type");
		}
		return medicinesByNameAndCategory;
	}

}
