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
import com.medicineapp.model.Description;
import com.medicineapp.service.IDescriptionService;

@RestController
@RequestMapping("/description-api")
public class DescriptionController {

	@Autowired
	IDescriptionService descriptionService;

	// http://localhost:8080/description-api/description
	@PostMapping("/description")
	Description addDescription(@RequestBody Description description) {
		return descriptionService.addDescription(description);
	}

	// http://localhost:8080/description-api/description
	@PutMapping("/description")
	void updateDescription(@RequestBody Description description) {
		descriptionService.updateDescription(description);
	}

	// http://localhost:8080/description-api/description/1
	@DeleteMapping("/description/{descriptionId}")
	void deleteProduct(@PathVariable("descriptionId") int descriptionId) {
		descriptionService.deleteDescription(descriptionId);
	}

	// http://localhost:8080/description-api/description
	@GetMapping("/description")
	public List<Description> getAll() {
		return descriptionService.getAll();
	}

	// http://localhost:8080/description-api/description/price/300
	@GetMapping("/description/price/{price}")
	public ResponseEntity<List<Description>> getByLessPrice(@PathVariable("price") double price) {
		List<Description> descriptionByPrice = descriptionService.getByLessPrice(price);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get all");
		return ResponseEntity.ok().headers(headers).body(descriptionByPrice);
	}

	// http://localhost:8080/description-api/description/power/25MG
	@GetMapping("/description/power/{power}")
	public ResponseEntity<List<Description>> getByPower(@PathVariable("power") String power) {
		List<Description> descriptionByPower = descriptionService.getByPower(power);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get all");
		return ResponseEntity.ok().headers(headers).body(descriptionByPower);
	}

	// http://localhost:8080/description-api/description/medicinename/Dart
	@GetMapping("/description/medicinename/{medicineName}")
	public ResponseEntity<List<Description>> getByName(@PathVariable("medicineName") String medicineName) {
		List<Description> descriptionByMedicineName = descriptionService.getByMedicineName(medicineName);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get all");
		return ResponseEntity.ok().headers(headers).body(descriptionByMedicineName);

	}

	// http://localhost:8080/description-api/description/medicinename/Dart/power/600mg
	@GetMapping("/description/medicinename/{medicineName}/power/{power}")
	public ResponseEntity<List<Description>> getByMedicineNameAndPower(
			@PathVariable("medicineName") String medicineName, @PathVariable("power") String power) {
		List<Description> descriptionByMedicineName = descriptionService.getByMedicineNameAndPower(medicineName, power);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get all");
		return ResponseEntity.ok().headers(headers).body(descriptionByMedicineName);
	}

}
