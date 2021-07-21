package com.hibernateannoconfig.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "student_id")
	private int stuId;
	@Column(name = "student_first_name")
	private String stuFirstName;
	@Column(name = "student_last_name")
	private String stuLastName;
	@Column(name = "student_address")
	private String stuAddress;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_laptop"
	,joinColumns = @JoinColumn(name = "student_id")
	,inverseJoinColumns = @JoinColumn(name = "laptop_id"))
	private List<Laptop> laptop;
	
	public Student() {
		super();
	}
	public Student(String stuFirstName, String stuLastName, String stuAddress) {
		super();
		this.stuFirstName = stuFirstName;
		this.stuLastName = stuLastName;
		this.stuAddress = stuAddress;
	}
//	public int getStuId() {
//		return stuId;
//	}
//	public void setStuId(int stuId) {
//		this.stuId = stuId;
//	}
	public String getStuFirstName() {
		return stuFirstName;
	}
	public void setStuFirstName(String stuFirstName) {
		this.stuFirstName = stuFirstName;
	}
	public String getStuLastName() {
		return stuLastName;
	}
	public void setStuLastName(String stuLastName) {
		this.stuLastName = stuLastName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public List<Laptop> getLaptaop() {
		return laptop;
	}
	public void setLaptaop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuFirstName=" + stuFirstName + ", stuLastName=" + stuLastName
				+ ", stuAddress=" + stuAddress + ", laptop=" + laptop + "]";
	}
}
