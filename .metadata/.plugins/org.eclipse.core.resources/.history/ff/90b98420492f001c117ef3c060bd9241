/**
 * 
 */
package com.medicineapp.controller;
/**
 * @author TharunyaREDDY
 * 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicineapp.model.Category;
import com.medicineapp.model.Medicine;
import com.medicineapp.service.ICategoryService;


@RestController
@RequestMapping("/category-api")
public class CategoryController {
	
	
	@Autowired
	ICategoryService categoryService;

	// http://localhost:8080/category-api/category
	@PostMapping("/category")
	Category addCategory(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}

	// http://localhost:8080/category-api/category
	@PutMapping("/category")
	void updateCategory(@RequestBody Category category) {
		categoryService.updateCategory(category);
	}

	// http://localhost:8080/category-api/category/3
	@DeleteMapping("/category/{categoryId}")
	void deleteCategory(@PathVariable("categoryId") int categoryId) {
		categoryService.deleteCategory(categoryId);
	}

	// http://localhost:8080/category-api/category
	@GetMapping("/category")
	public ResponseEntity<List<Category>> getAll() {
		List<Category> allCategory =  categoryService.getAll();
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get All");
		return ResponseEntity.ok().headers(headers).body(allCategory); 
	}
	
	
	// http://localhost:8080/category-api/category/categoryname/Cold Tablet
	@GetMapping("/category/categoryname/{categoryName}")
	public ResponseEntity<List<Category>> getByCategoryName(@PathVariable("categoryName") String categoryName) {
		List<Category> categoryByName =  categoryService.getByCategoryName(categoryName);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get By category Name");
		return ResponseEntity.ok().headers(headers).body(categoryByName); 
	}
//	
//	//http://localhost:8080/category-api/category/categoryname/Cold/medicinename/Dolo
//	@GetMapping("/category/categoryname/{catgeoryname}/medicinename/{medicinename}")
//	public List<Category> getByCategoryNameAndMedicineName(@PathVariable("categroyName") String categoryName,@PathVariable("name") String name){
//		return categoryService.getByCategoryNameAndMedicineName(categoryName, name);
//	}


}
