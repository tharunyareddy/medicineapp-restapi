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
import com.medicineapp.model.Brand;

public interface IBrandService {

	Brand addBrand(Brand brand);

	void updateBrand(Brand barnd);

	void deleteBrand(int brandId) throws MedicineNotFoundException;

	List<Brand> getAll() throws MedicineNotFoundException;
	
	List<Brand> getByBrandName(String brandName) throws MedicineNotFoundException;
	
	List<Brand> getByOrigin(String origin) throws MedicineNotFoundException; 
	
	List<Brand> getByBrandNameAndOrigin(String brandName,String origin) throws MedicineNotFoundException;

	
//	List<Brand> getByBrandNameAndMedicineName(String brandName,String name) throws MedicineNotFoundException;
}
