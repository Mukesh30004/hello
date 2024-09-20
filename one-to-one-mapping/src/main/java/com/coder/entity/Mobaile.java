package com.coder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mobaile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String mobilename;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobilename() {
		return mobilename;
	}

	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	
}

	

