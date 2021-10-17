/**
 * 
 */
package com.medicineapp.service;

/**
 * @author TharunyaREDDY
 * 
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medicineapp.exception.MedicineNotFoundException;
import com.medicineapp.model.Description;
import com.medicineapp.repository.IDescriptionRepository;

@Service
public class DescriptionServiceImpl implements IDescriptionService {

	@Autowired
	IDescriptionRepository descriptionRepository;

	// To add Description
	@Override
	public Description addDescription(Description description) {
		return descriptionRepository.save(description);
	}

	// To update Description
	@Override
	public void updateDescription(Description description) {
		descriptionRepository.save(description);

	}

	// To delete Description by description Id
	@Override
	public void deleteDescription(int descriptionId) throws MedicineNotFoundException {
		descriptionRepository.findById(descriptionId)
				.orElseThrow(() -> new MedicineNotFoundException("No Medicine Found,Invalid Id"));
		descriptionRepository.deleteById(descriptionId);
	}

	// To get all description
	@Override
	public List<Description> getAll() throws MedicineNotFoundException {

		List<Description> allMedicines = descriptionRepository.findAll();
		if (allMedicines.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines");
		}
		return allMedicines;

	}

	// To get description by medicine
	@Override
	public List<Description> getByMedicineName(String medicineName) throws MedicineNotFoundException {

		List<Description> allMedicinesByName = descriptionRepository.findByName(medicineName);
		if (allMedicinesByName.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines");
		}
		return allMedicinesByName;

	}

	// To get medicine by price less than
	@Override
	public List<Description> getByLessPrice(double price) throws MedicineNotFoundException {

		List<Description> allMedicinesByPrice = descriptionRepository.findByPriceLessThan(price);
		if (allMedicinesByPrice.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines");
		}
		return allMedicinesByPrice;

	}

	// To get medicine by power
	@Override
	public List<Description> getByPower(String power) throws MedicineNotFoundException {

		List<Description> allMedicinesByPower = descriptionRepository.findByPower(power);
		if (allMedicinesByPower.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines");
		}
		return allMedicinesByPower;

	}

	// To get description by medicine name and power
	@Override
	public List<Description> getByMedicineNameAndPower(String medicineName, String power)
			throws MedicineNotFoundException {
		List<Description> allMedicinesByPowerAndName = descriptionRepository.findByNameAndPower(medicineName, power);
		if (allMedicinesByPowerAndName.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines");
		}
		return allMedicinesByPowerAndName;

	}
}
