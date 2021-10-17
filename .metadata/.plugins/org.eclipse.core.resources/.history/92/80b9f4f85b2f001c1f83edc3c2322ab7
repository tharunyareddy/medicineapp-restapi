/**
 * 
 */
package com.medicineapp.service;

/**
 * @author TharunyaREDDY
 * 
 */
import java.util.List;

import com.medicineapp.exception.MedicineNotFoundException;
import com.medicineapp.model.Description;

public interface IDescriptionService {
	
	Description addDescription(Description description);

	void updateDescription(Description description);

	void deleteDescription(int descriptionId) throws MedicineNotFoundException;

	List<Description> getAll() throws MedicineNotFoundException;

//	List<Description> getByMedicineName(String medicineName) throws MedicineNotFoundException;

	List<Description> getByLessPrice(double price) throws MedicineNotFoundException;
	
	List<Description> getByPower(String power) throws MedicineNotFoundException;
	
	//List<Description> getByMedicineNameAndPower(String medicineName,String power) throws MedicineNotFoundException;

}
