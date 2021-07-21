package com.hibernateannoconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ambati.sambashivudu
 *
 */
@Entity
@Table(name = "laptop")
public class Laptop {
	@Id
	@GeneratedValue
	@Column(name = "laptop_id")
	private int lapId;
	@Column(name = "laptop_name")
	private String LapName;
	@Column(name = "laptop_model")
	private String LapModel;
	
	public Laptop(String lapName, String lapModel) {
		super();
		LapName = lapName;
		LapModel = lapModel;
	}
//	public int getLapId() {
//		return lapId;
//	}
//	public void setLapId(int lapId) {
//		this.lapId = lapId;
//	}
	public String getLapName() {
		return LapName;
	}
	public void setLapName(String lapName) {
		LapName = lapName;
	}
	public String getLapModel() {
		return LapModel;
	}
	public void setLapModel(String lapModel) {
		LapModel = lapModel;
	}
	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", LapName=" + LapName + ", LapModel=" + LapModel + "]";
	}
	


}
