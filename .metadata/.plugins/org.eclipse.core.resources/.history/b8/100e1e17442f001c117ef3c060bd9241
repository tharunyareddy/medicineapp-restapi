/**
 * 
 */

package com.medicineapp.model;

/**
 * @author TharunyaREDDY
 * 
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class Description {

	@Id
	@GeneratedValue(generator = "description_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "description_gen", sequenceName = "description_seq", initialValue = 1, allocationSize = 1)
	private Integer descriptionId;
	@Column(length = 20)
	private String power;

	private double price;
	
	@OneToOne(mappedBy = "description")
	private Medicine medicine;

	public Integer getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(Integer descriptionId) {
		this.descriptionId = descriptionId;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public Description() {
		super();
	}

	public Description(String power, double price, Medicine medicine) {
		super();
		this.power = power;
		this.price = price;
		this.medicine = medicine;
	}

	

}
