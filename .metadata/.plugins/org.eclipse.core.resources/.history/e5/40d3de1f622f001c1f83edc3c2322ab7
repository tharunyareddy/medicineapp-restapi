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
import com.medicineapp.model.Brand;
import com.medicineapp.repository.IBrandRepository;

@Service
public class BrandServiceImpl implements IBrandService {

	@Autowired
	IBrandRepository brandRepository;

	public void setBrandRepository(IBrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	// To add brand 
	@Override
	public Brand addBrand(Brand brand) {
		return brandRepository.save(brand);
	}

	// To update brand
	@Override
	public void updateBrand(Brand brand) {
		brandRepository.save(brand);
	}

	// To delete brand By Id
	@Override
	public void deleteBrand(int brandId) throws MedicineNotFoundException {
		brandRepository.findById(brandId).orElseThrow(() -> new MedicineNotFoundException("No Brand Found,Invalid Id"));
		brandRepository.deleteById(brandId);
	}

	// To Get all Brands
	@Override
	public List<Brand> getAll() throws MedicineNotFoundException {
		List<Brand> allbrands = brandRepository.findAll();
		if (allbrands.isEmpty()) {
			throw new MedicineNotFoundException("No Brand");
		}
		return allbrands;
	}

	// To Get By Brand Name
	@Override
	public List<Brand> getByBrandName(String brandName) throws MedicineNotFoundException {
		List<Brand> brandNames = brandRepository.findBybrandName(brandName);
		if (brandNames.isEmpty()) {
			throw new MedicineNotFoundException("No Brand of this name");
		}
		return brandNames;

	}

	// To get By Origin
	@Override
	public List<Brand> getByOrigin(String origin) throws MedicineNotFoundException {
		List<Brand> medicineByOrigin = brandRepository.findByOrigin(origin);
		if (medicineByOrigin.isEmpty()) {
			throw new MedicineNotFoundException("No Brand of this name");
		}
		return medicineByOrigin;
	}

	// To get by brand Name And origin
	@Override
	public List<Brand> getByBrandNameAndOrigin(String brandName, String origin) throws MedicineNotFoundException {

		List<Brand> medicineByOriginAndName = brandRepository.findBybrandNameAndOrigin(brandName, origin);
		if (medicineByOriginAndName.isEmpty()) {
			throw new MedicineNotFoundException("No Brand of this name");
		}
		return medicineByOriginAndName;

	}

//	// To get By Brand Name and Medicine Name
//	@Override
//	public List<Brand> getByBrandNameAndMedicineName(String brandName, String name) throws MedicineNotFoundException {
//
//		List<Brand> medicineByBrandNameAndName = brandRepository.findByBrandNameAndMedicineName(brandName, name);
//		if (medicineByBrandNameAndName.isEmpty()) {
//			throw new MedicineNotFoundException("No Brand of this name");
//		}
//		return medicineByBrandNameAndName;
//
//	}

}
