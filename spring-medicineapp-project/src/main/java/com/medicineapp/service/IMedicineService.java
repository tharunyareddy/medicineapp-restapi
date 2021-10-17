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

	Medicine addMedicine(Medicine medicine, int brandId);

	Medicine updateMedicine(Medicine medicine, int categoryId);

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

}
