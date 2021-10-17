/**
 * 
 */
package com.medicineapp.repository;

import java.time.LocalDate;

/**
 * @author TharunyaREDDY
 * 
 */

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicineapp.exception.MedicineNotFoundException;
import com.medicineapp.model.Medicine;

@Repository
public interface IMedicineRepository extends JpaRepository<Medicine, Integer> {

	List<Medicine> findByMedicineName(String medicineName);

	List<Medicine> findByMedicineType(String medicineType);
	
	List<Medicine> findByManufactureDate(LocalDate manufactureDate);
	
	List<Medicine> findByExpiryDate(LocalDate expiryDate);

	@Query("from Medicine where medicineName =?1 and medicineType=?2")
	List<Medicine> findByMedicineNameAndMedicineType(String medicineName, String medicineType) throws MedicineNotFoundException;
	
	@Query("from Medicine m inner join m.categoryList c where m.medicineName=?1 and c.categoryName=?2")
	List<Medicine> findByMedicineNameAndCategoryName(String medicineName, String categoryName);

}
