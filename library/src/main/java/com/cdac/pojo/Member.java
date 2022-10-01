package com.cdac.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Member")

public class Member {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false,length=20)
	private String Fname;
	@Column(nullable=false,length=20)
	private String Lname;
	private String add;
	private String add2;
	private String city;
	private String state;
	private int zip;
	public String gender;
	@Column(nullable=false,length=64)
	public Long phone;
	@Column(nullable=false,unique=true,length=45)
    private String email;
	@Column(nullable=false,length=64)
    private String password;
    
	public Member() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", add=" + add + ", add2=" + add2
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", gender=" + gender + ", phone=" + phone
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
    
    
	
	
}