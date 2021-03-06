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
import com.medicineapp.model.Description;

@Repository
public interface IDescriptionRepository extends JpaRepository<Description, Integer> {

	List<Description> findByPriceLessThan(double price);

	List<Description> findByPower(String power);

	@Query("from Description d inner join d.medicine m where m.medicineName=?1")
	List<Description> findByName(String medicineName);

	@Query("from Description d inner join d.medicine m  where m.medicineName=?1 and d.power=?2")
	List<Description> findByNameAndPower(String medicineName, String power);

}
