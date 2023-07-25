package com.farmermicroservice.model;

public class Farmer {

	private int fId;
	private String famerName;
	private String fPassword;
	private String fMailId;
	private String fContactNumber;
	private String fBank;
	private int fAccountNumber;
	private String bankBranch;
	private String fLocation;

	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Farmer(int fId, String famerName, String fPassword, String fMailId, String fContactNumber, String fBank,
			int fAccountNumber, String bankBranch, String fLocation) {
		super();
		this.fId = fId;
		this.famerName = famerName;
		this.fPassword = fPassword;
		this.fMailId = fMailId;
		this.fContactNumber = fContactNumber;
		this.fBank = fBank;
		this.fAccountNumber = fAccountNumber;
		this.bankBranch = bankBranch;
		this.fLocation = fLocation;
	}

	
	
	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getFamerName() {
		return famerName;
	}

	public void setFamerName(String famerName) {
		this.famerName = famerName;
	}

	public String getfPassword() {
		return fPassword;
	}

	public void setfPassword(String fPassword) {
		this.fPassword = fPassword;
	}

	public String getfMailId() {
		return fMailId;
	}

	public void setfMailId(String fMailId) {
		this.fMailId = fMailId;
	}

	public String getfContactNumber() {
		return fContactNumber;
	}

	public void setfContactNumber(String fContactNumber) {
		this.fContactNumber = fContactNumber;
	}

	public String getfBank() {
		return fBank;
	}

	public void setfBank(String fBank) {
		this.fBank = fBank;
	}

	public int getfAccountNumber() {
		return fAccountNumber;
	}

	public void setfAccountNumber(int fAccountNumber) {
		this.fAccountNumber = fAccountNumber;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getfLocation() {
		return fLocation;
	}

	public void setfLocation(String fLocation) {
		this.fLocation = fLocation;
	}
	
	

	@Override
	public String toString() {
		return "Farmer [fId=" + fId + ", famerName=" + famerName + ", fPassword=" + fPassword + ", fMailId=" + fMailId
				+ ", fContactNumber=" + fContactNumber + ", fBank=" + fBank + ", fAccountNumber=" + fAccountNumber
				+ ", bankBranch=" + bankBranch + ", fLocation=" + fLocation + "]";
	}

}
