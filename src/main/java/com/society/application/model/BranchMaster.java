package com.society.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BranchMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String name;
    private String openingDate;
    
    
    
    
    
	public String getOpening_date() {
		return openingDate;
	}

	public void setOpening_date(String opening_date) {
		this.openingDate = opening_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
