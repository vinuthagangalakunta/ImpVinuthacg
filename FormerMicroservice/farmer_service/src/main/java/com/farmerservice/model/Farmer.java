package com.farmerservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Farmerslist")
public class Farmer {
	

	@Id
	private String farmerId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	private String location;
	
	private String bank;
	private String accountNo;
	private String bankbranch;
    private String about;
    
   // private List<Crops> crops;
    
	
	public Farmer() {

	
}

public Farmer(String farmerId, String firstName, String lastName, String username, String password, String email,
		String phoneNumber, String location, String bank, String accountNo, String bankbranch, String about) {
	super();
	this.farmerId = farmerId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.username = username;
	this.password = password;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.location = location;
	this.bank = bank;
	this.accountNo = accountNo;
	this.bankbranch = bankbranch;
	this.about = about;
}

public String getFarmerId() {
	return farmerId;
}

public void setFarmerId(String farmerId) {
	this.farmerId = farmerId;
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

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getBank() {
	return bank;
}

public void setBank(String bank) {
	this.bank = bank;
}

public String getAccountNo() {
	return accountNo;
}

public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}

public String getBankbranch() {
	return bankbranch;
}

public void setBankbranch(String bankbranch) {
	this.bankbranch = bankbranch;
}

public String getAbout() {
	return about;
}

public void setAbout(String about) {
	this.about = about;
}

@Override
public String toString() {
	return "Farmer [farmerId=" + farmerId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
			+ username + ", password=" + password + ", email=" + email + ", phoneNumber=" + phoneNumber + ", location="
			+ location + ", bank=" + bank + ", accountNo=" + accountNo + ", bankbranch=" + bankbranch + ", about="
			+ about + "]";
}


	

}
