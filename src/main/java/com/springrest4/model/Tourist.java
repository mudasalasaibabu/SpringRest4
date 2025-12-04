package com.springrest4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tourist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
	@Column(name="first_name")
 private String firstName;
	@Column(name="last_name")
 private String lastName;
 private String gender;
 private String nationality;
public Tourist() {
	super();
	// TODO Auto-generated constructor stub
}
public Tourist( String firstName, String lastName, String gender, String nationality) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.nationality = nationality;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
@Override
public String toString() {
	return "Tourist [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
			+ ", nationality=" + nationality + "]";
}
 
}
