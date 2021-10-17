/**
 * 
 */
package com.medicineapp.controller;

import java.time.LocalDate;

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

import com.medicineapp.exception.MedicineNotFoundException;
import com.medicineapp.model.Medicine;
import com.medicineapp.service.IMedicineService;

@RestController
@RequestMapping("/medicine-api")
public class MedicineController {

	IMedicineService medicineService;

	@Autowired
	public void setMedicineService(IMedicineService medicineService) {
		this.medicineService = medicineService;
	}

	// http://localhost:8080/medicine-api/medicines
	@PostMapping("/medicines")
	Medicine addMedicine(@RequestBody Medicine medicine) {
		return medicineService.addMedicine(medicine);
	}

	// http://localhost:8080/medicine-api/medicines
	@PutMapping("/medicines")
	void updateMedicine(@RequestBody Medicine medicine) {
		medicineService.updateMedicine(medicine);
	}

	// http://localhost:8080/medicine-api/medicines/3
	@DeleteMapping("/medicines/{medicineId}")
	void deleteMedicine(@PathVariable("medicineId") int medicineId) {
		medicineService.deleteMedicine(medicineId);
	}

	// http://localhost:8080/medicine-api/medicines/1
	@GetMapping("/medicines/{medicineId}")
	ResponseEntity<Medicine> getById(@PathVariable("medicineId") int medicineId) {
		Medicine medicineById =  medicineService.getById(medicineId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get By Id");
		return ResponseEntity.ok().headers(headers).body(medicineById); 
	}

	// http://localhost:8080/medicine-api/medicines
	@GetMapping("/medicines")
	ResponseEntity<List<Medicine>> getAll() {
		List<Medicine> allmedicines = medicineService.getAll();
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get all");
		return ResponseEntity.ok().headers(headers).body(allmedicines); 
	}

	// http://localhost:8080/medicine-api/medicines/medicinename/Dolo
	@GetMapping("/medicines/medicinename/{medicineName}")
	ResponseEntity<List<Medicine>> getByMedicineName(@PathVariable("medicineName") String medicineName) {
		List<Medicine> medicineByName = medicineService.getByMedicineName(medicineName);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get By Name");
		return ResponseEntity.ok().headers(headers).body(medicineByName); 
	}

	// http://localhost:8080/medicine-api/medicines/medicinetype/Tablet
	@GetMapping("/medicines/medicinetype/{medicineType}")
	ResponseEntity<List<Medicine>> getByMedicineType(@PathVariable("medicineType") String medicineType) {
		List<Medicine> medicineByType = medicineService.getByMedicineType(medicineType);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get By Type");
		return ResponseEntity.ok().headers(headers).body(medicineByType); 
	}
	
	
	// http://localhost:8080/medicine-api/medicines/manufacturedate/2021-12-04
	@GetMapping("/medicines/manufacturedate/{manufactureDate}")
	ResponseEntity<List<Medicine>> getByManufactureDate(@PathVariable("manufactureDate") String manufactureDate){
		List<Medicine> medicineByDate = medicineService.getByManufactureDate(LocalDate.parse(manufactureDate));
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get By Type Manufacture Date");
		return ResponseEntity.ok().headers(headers).body(medicineByDate); 
	}
	
	// http://localhost:8080/medicine-api/medicines/expirydate/2024-12-04
	@GetMapping("/medicines/expirydate/{expiryDate}")
	ResponseEntity<List<Medicine>> getByExpiryDate(@PathVariable("expiryDate") String expiryDate){
		List<Medicine> medicineByExpiryDate = medicineService.getByExpiryDate(LocalDate.parse(expiryDate));
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get By Expiry Date");
		return ResponseEntity.ok().headers(headers).body(medicineByExpiryDate); 
		
	}

	// http://localhost:8080/medicine-api/medicines/medicinename/Dolo/medicinetype/Tablet
	@GetMapping("/medicines/medicinename/{medicineName}/medicinetype/{medicineType}")
	ResponseEntity<List<Medicine>> getByMedicineNameAndMedicineType(@PathVariable("medicineName") String medicineName,
			@PathVariable("medicineType") String medicineType) {
		List<Medicine> medicineByNameAndType = medicineService.getByMedicineNameAndMedicineType(medicineName, medicineType);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get By Name and Type");
		return ResponseEntity.ok().headers(headers).body(medicineByNameAndType); 
	}

	// http://localhost:8080/medicine-api/medicines/medicinename/Dolo/categoryname/Fever Tablet
	@GetMapping("/medicines/medicinename/{medicineName}/categoryname/{categoryName}")
	List<Medicine> getByMedicineNameAndCategoryName(@PathVariable("medicineName") String medicineName,
			@PathVariable("categoryName") String categoryName) {
		return medicineService.getByMedicineNameAndCategoryName(medicineName, categoryName);
	}

}
