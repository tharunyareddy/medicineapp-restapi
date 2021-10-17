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
import com.medicineapp.model.Brand;
import com.medicineapp.model.Medicine;
import com.medicineapp.service.IBrandService;

@RestController
@RequestMapping("/brand-api")
public class BrandController {

	@Autowired
	IBrandService brandService;


	// http://localhost:8080/brand-api/brand
	@PostMapping("/brand")
	Brand addBrand(@RequestBody Brand brand) {
		return brandService.addBrand(brand);
	}

	// http://localhost:8080/brand-api/brand
	@PutMapping("/brand")
	void updateBrand(@RequestBody Brand brand) {
		brandService.updateBrand(brand);
	}

	// http://localhost:8080/brand-api/brand/1
	@DeleteMapping("/brand/{brandId}")
	void deleteMedicine(@PathVariable("brandId") int brandId) {
		brandService.deleteBrand(brandId);
	}

	// http://localhost:8080/brand-api/brand
	@GetMapping("/brand")
	public List<Brand> getAll() {
		return brandService.getAll();
	}

	// http://localhost:8080/brand-api/brand/brandname/Dolo
	@GetMapping("/brand/brandname/{brandName}")
	ResponseEntity<List<Brand>> getByBrandName(@PathVariable("brandName") String brandName) {
		List<Brand> brandname = brandService.getByBrandName(brandName);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get all");
		return ResponseEntity.ok().headers(headers).body(brandname); 
		
	}

	// http://localhost:8080/brand-api/brand/brandorigin/India
	@GetMapping("/brand/brandorigin/{origin}")
	ResponseEntity<List<Brand>> getByOrigin(@PathVariable("origin") String origin) {
		
		List<Brand> brandByOrigin = brandService.getByOrigin(origin);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get all");
		return ResponseEntity.ok().headers(headers).body(brandByOrigin); 
		
	}
	
	// http://localhost:8080/brand-api/brand/brandname/Dolo/origin/India
	@GetMapping("/brand/brandname/{brandName}/origin/{origin}")
	ResponseEntity<List<Brand>> getByBrandNameAndOrigin(@PathVariable("brandName") String brandName,
			@PathVariable("origin") String origin) {
	
		List<Brand> brandByNameAndOrigin =  brandService.getByBrandNameAndOrigin(brandName, origin);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get all");
		return ResponseEntity.ok().headers(headers).body(brandByNameAndOrigin);
		
		
	}
//	
//	// http://localhost:8080/brand-api/brand/brandname/Dart Tablet/name/Dart
//	@GetMapping("/brand/brandname/{brandName}/medicinename/{name}")
//	List<Brand> getByBrandNameAndMedicineName(@PathVariable("brandName") String brandName,
//			@PathVariable("name") String name) {
//		return brandService.getByBrandNameAndMedicineName(brandName, name);
//	}
//


}
