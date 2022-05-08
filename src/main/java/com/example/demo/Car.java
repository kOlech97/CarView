package com.example.demo;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String make;
	
	@Column
	private String carModel;
	
	@Column
	private String problemDescription;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", carModel=" + carModel + ", problemDescription="
				+ problemDescription + "]";
	}
	
	
	
}
