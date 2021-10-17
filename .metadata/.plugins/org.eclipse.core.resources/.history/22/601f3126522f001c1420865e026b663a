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
import com.medicineapp.model.Category;

public interface ICategoryService {

	Category addCategory(Category category);

	void updateCategory(Category category);

	void deleteCategory(int categoryId) throws MedicineNotFoundException;
	
	List<Category> getAll() throws MedicineNotFoundException;
	
	List<Category> getByCategoryName(String categoryName) throws MedicineNotFoundException;

//	List<Category> getByCategoryNameAndMedicineName(String categoryName, String name) throws MedicineNotFoundException;
		
}
