package com.workSE.entity;

public class Account {
	
	private long accountNum;
	private long ID;
	private String clientName;
	private int password;
	private String address;
	private long tel;
	private String openDay;
	private long principal;
	private int status;
	
	
	
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", ID=" + ID + ", clientName=" + clientName + ", password="
				+ password + ", address=" + address + ", tel=" + tel + ", openDay=" + openDay + ", principal="
				+ principal + ", status=" + status + "]";
	}
	
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public String getOpenDay() {
		return openDay;
	}
	public void setOpenDay(String openDay) {
		this.openDay = openDay;
	}
	public long getPrincipal() {
		return principal;
	}
	public void setPrincipal(long principal) {
		this.principal = principal;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
