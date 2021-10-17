/**
 * 
 */
package com.medicineapp.model;
/**
 * @author TharunyaREDDY
 * 
 */

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Brand {

	@Id
	@GeneratedValue(generator = "brand_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "brand_gen", sequenceName = "brand_seq", initialValue = 1, allocationSize = 1)
	private Integer brandId;

	@Column(length = 20)
	private String brandName;

	@Column(length = 20)
	private String origin;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "brand")
	@JoinColumn(name="brand_id")
	@JsonIgnore
	Set<Medicine> medicineList;

	
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Set<Medicine> getMedicineList() {
		return medicineList;
	}

	public void setMedicineList(Set<Medicine> medicineList) {
		this.medicineList = medicineList;
	}

	public Brand() {
		super();
	}

	public Brand(String brandName, String origin, Set<Medicine> medicineList) {
		super();
		this.brandName = brandName;
		this.origin = origin;
		this.medicineList = medicineList;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", origin=" + origin + ", medicineList="
				+ medicineList + "]";
	}

}
