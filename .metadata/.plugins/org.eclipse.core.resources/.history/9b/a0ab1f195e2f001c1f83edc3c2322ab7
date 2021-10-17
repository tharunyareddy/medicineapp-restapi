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
import com.medicineapp.model.Brand;

@Repository
public interface IBrandRepository extends JpaRepository<Brand, Integer> {

	List<Brand> findBybrandName(String brandName);

	List<Brand> findByOrigin(String origin);

	
	@Query("from Brand b where b.brandName=?1 and b.origin=?2")
	List<Brand> findBybrandNameAndOrigin(String brandName, String origin);

	
	//@Query("from Brand b inner join b.medicineList m  where b.brandName=?1 and m.name=?2")
	//List<Brand> findByBrandNameAndMedicineName(String brandName, String name);

}
