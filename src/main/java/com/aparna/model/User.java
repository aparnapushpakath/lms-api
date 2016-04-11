package com.aparna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String firstname;
private String lastname;
private String phone;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
