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
import com.medicineapp.model.Category;
import com.medicineapp.repository.ICategoryRepository;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	ICategoryRepository categoryRepository;

	public void setCategoryRepository(ICategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	// To add Category
	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	// To update Category Details
	@Override
	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}

	// To Delete Category By Id
	@Override
	public void deleteCategory(int categoryId) throws MedicineNotFoundException {
		categoryRepository.findById(categoryId)
				.orElseThrow(() -> new MedicineNotFoundException("No Category Found,Invalid Id"));
		categoryRepository.deleteById(categoryId);
	}

	// To get All
	@Override
	public List<Category> getAll() throws MedicineNotFoundException {

		List<Category> allMedicinesByCategory = categoryRepository.findAll();
		if (allMedicinesByCategory.isEmpty()) {
			throw new MedicineNotFoundException("No Medicines");
		}
		return allMedicinesByCategory;

	}

	// To get by Category Name
	@Override
	public List<Category> getByCategoryName(String categoryName) throws MedicineNotFoundException {
		List<Category> categoryByName = categoryRepository.findByCategoryName(categoryName);

		if (categoryByName.isEmpty()) {
			throw new MedicineNotFoundException("No category name");
		}

		return categoryByName;
	}
//
//	// To get by Category Name And by Medicine Name
//	@Override
//	public List<Category> getByCategoryNameAndMedicineName(String categoryName, String name)
//			throws MedicineNotFoundException {
//		List<Category> categoryByNameAndMedicineName = categoryRepository.findByCategoryNameAndName(categoryName, name);
//		if (categoryByNameAndMedicineName.isEmpty()) {
//			throw new MedicineNotFoundException("No Medicines found by category name or medicine name");
//		}
//
//		return categoryByNameAndMedicineName;
//	}

}
