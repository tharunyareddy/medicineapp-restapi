/**
 * 
 */
package com.medicineapp.repository;

/**
 * @author TharunyaREDDY
 * 
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicineapp.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

	
	Category findByCategoryId(int categoryId);
	
	List<Category> findByCategoryName(String categoryName);

	
//	//@Query("from Category c inner join c.medicinesList m  where c.categoryName=?1 and m.name=?2")
//	List<Category> findByCategoryNameAndName(String categoryName, String name);

	
}
