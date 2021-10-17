/**
 * 
 */
package com.medicineapp.model;

/**
 * @author TharunyaREDDY
 * 
 */

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Category {

	@Id
	@GeneratedValue(generator = "category_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "category_gen", sequenceName = "category_seq", initialValue = 1, allocationSize = 1)
	private Integer categoryId;

	@Column(length = 20)
	private String categoryName;

	@ManyToMany(mappedBy = "categoryList", fetch = FetchType.EAGER)
	@JsonIgnore
	Set<Medicine> medicinesList;

	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Medicine> getMedicinesList() {
		return medicinesList;
	}

	public void setMedicinesList(Set<Medicine> medicinesList) {
		this.medicinesList = medicinesList;
	}

	public Category() {
		super();
	}

	public Category(String categoryName, Set<Medicine> medicinesList) {
		super();
		this.categoryName = categoryName;
		this.medicinesList = medicinesList;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", medicinesList="
				+ medicinesList + "]";
	}
	
	

}
