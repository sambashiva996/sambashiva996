package com.petpeers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_my_pets")
public class PetSold {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int myPetId;
	@Column(name = "sold_pet_id")
	private int sPetId;
	@Column(name = "sold_pet_name")
	private String spetName;
	@Column(name = "sold_pet_age")
	private String sPetAge;
	@Column(name = "sold_pet_place")
	private String sPetPlace;
	@Column(name = "sold_pet_sold")
	private String sPetSold;
	public int getMyPetId() {
		return myPetId;
	}
	public void setMyPetId(int myPetId) {
		this.myPetId = myPetId;
	}
	public int getsPetId() {
		return sPetId;
	}
	public void setsPetId(int sPetId) {
		this.sPetId = sPetId;
	}
	public String getSpetName() {
		return spetName;
	}
	public void setSpetName(String spetName) {
		this.spetName = spetName;
	}
	public String getsPetAge() {
		return sPetAge;
	}
	public void setsPetAge(String sPetAge) {
		this.sPetAge = sPetAge;
	}
	public String getsPetPlace() {
		return sPetPlace;
	}
	public void setsPetPlace(String sPetPlace) {
		this.sPetPlace = sPetPlace;
	}
	public String getsPetSold() {
		return sPetSold;
	}
	public void setsPetSold(String sPetSold) {
		this.sPetSold = sPetSold;
	}
	
	

}
