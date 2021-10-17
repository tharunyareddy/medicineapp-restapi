/**
 * 
 */

package com.medicineapp.model;

/**
 * @author TharunyaREDDY
 * 
 */

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Medicine {

	@Id
	@GeneratedValue(generator = "medicine_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "medicine_gen", sequenceName = "medicine_seq", initialValue = 1, allocationSize = 1)
	private int medicineId;
	@Column(length = 20)
	private String medicineName;
	@Column(length = 20)
	private String medicineType;

	private LocalDate manufactureDate;
	private LocalDate expiryDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "brand_id")
	@JsonIgnore
	Brand brand;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "medicine_category", joinColumns = { @JoinColumn(name = "medicine_id") }, inverseJoinColumns = {
			@JoinColumn(name = "category_id") })
	@JsonIgnore
	Set<Category> categoryList=new HashSet<>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="description_id")
	@JsonIgnore
	Description description;

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineType() {
		return medicineType;
	}

	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Set<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(Set<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Medicine() {
		super();
	}

	public Medicine(String medicineName, String medicineType, LocalDate manufactureDate, LocalDate expiryDate, Brand brand,
			Set<Category> categoryList, Description description) {
		super();
		this.medicineName = medicineName;
		this.medicineType = medicineType;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.brand = brand;
		this.categoryList = categoryList;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", medicineType=" + medicineType + ", manufactureDate="
				+ manufactureDate + ", expiryDate=" + expiryDate + ", brand=" + brand + ", categoryList=" + categoryList
				+ ", description=" + description + "]";
	}



}
