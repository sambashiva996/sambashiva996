package com.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tbl_registration_boot")
//@NamedQueries({
//	@NamedQuery(name = "deleteById" ,query = "delete from Registration r where r.custId=:custId")
//})
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	@NotEmpty(message = "Should not Be Empty")
	private String firstName;
	@NotEmpty(message = "Should not Be Empty")
	private String lastName;
	@NotEmpty(message = "Should not Be Empty")
	private String gender;
	private String hobbies;
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	@NotEmpty(message = "Should not Be Empty")
	private String email;
	@NotEmpty(message = "Should not Be Empty")
	private String mobileNumber;
	@NotEmpty(message = "Should not Be Empty")
	private String address;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Registration [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", hobbies=" + hobbies + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}
	
	
	
	
	

}
