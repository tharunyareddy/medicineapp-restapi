/**
 * 
 */
package com.medicineapp.service;

import java.time.LocalDate;
/**
 * @author TharunyaREDDY
 * 
 */
import java.util.List;

import com.medicineapp.exception.MedicineNotFoundException;
import com.medicineapp.model.Medicine;

public interface IMedicineService {

	// CRUD

	Medicine addMedicine(Medicine medicine);

	void updateMedicine(Medicine medicine);

	void deleteMedicine(int medicineId) throws MedicineNotFoundException;

	Medicine getById(int medicineId) throws MedicineNotFoundException;

	List<Medicine> getAll() throws MedicineNotFoundException;

	// Custom

	List<Medicine> getByMedicineName(String medicineName) throws MedicineNotFoundException;

	List<Medicine> getByMedicineType(String medicineType) throws MedicineNotFoundException;

	List<Medicine> getByManufactureDate(LocalDate manufactureDate) throws MedicineNotFoundException;

	List<Medicine> getByExpiryDate(LocalDate expiryDate) throws MedicineNotFoundException;

	List<Medicine> getByMedicineNameAndMedicineType(String medicineName, String medicineType)
			throws MedicineNotFoundException;

	List<Medicine> getByMedicineNameAndCategoryName(String medicineName, String categoryName) throws MedicineNotFoundException;

}
