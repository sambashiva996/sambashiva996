package com.petpeers.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tbl_pets")
public class Pets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	@NotEmpty(message = "Pet Name Should Not Be Empty")
	@Column(name = "pet_name")
	private String petName;
	@NotEmpty(message = "Pet Age Should Not Be Empty")
	@Column(name = "pet_age")
	private String petAge;
	@NotEmpty(message = "Pet Place Should Not Be Empty")
	@Column(name = "pet_place")
	private String petPlace;
	@Column(name = "pet_buy_or_sold")
	private String petBuyOrSold;
	@ManyToOne(cascade = CascadeType.ALL)
	private UserRegistration userRegistration;
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetAge() {
		return petAge;
	}
	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}
	public String getPetPlace() {
		return petPlace;
	}
	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}
	public String getPetBuyOrSold() {
		return petBuyOrSold;
	}
	public void setPetBuyOrSold(String petBuyOrSold) {
		this.petBuyOrSold = petBuyOrSold;
	}
	public UserRegistration getUserRegistration() {
		return userRegistration;
	}
	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}
	@Override
	public String toString() {
		return "Pets [petId=" + petId + ", petName=" + petName + ", petAge=" + petAge + ", petPlace=" + petPlace
				+ ", petBuyOrSold=" + petBuyOrSold + ", userRegistration=" + userRegistration + "]";
	}
	
}
