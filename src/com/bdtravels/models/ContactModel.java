package com.bdtravels.models;

import java.util.List;

public class ContactModel {
	String email;
	String title;
	String fullName;
	String country;
	String phoneNumber;
	String travelTime;
	String date;
	private List<ContactModel> contactInfo;
	
	
	
	public List<ContactModel> getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(List<ContactModel> contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}
	
	
}
