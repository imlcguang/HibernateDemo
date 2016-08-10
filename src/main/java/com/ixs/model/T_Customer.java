package com.ixs.model;

public class T_Customer {
	private int  CustomerID ;
	private String CustomerName;
	private String RelationName;
	private String RelationPhone;
	private String Address;
	private String Email;
	private String Remark;
	
	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getRelationName() {
		return RelationName;
	}

	public void setRelationName(String relationName) {
		RelationName = relationName;
	}

	public String getRelationPhone() {
		return RelationPhone;
	}

	public void setRelationPhone(String relationPhone) {
		RelationPhone = relationPhone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	@Override
	public String toString() {
		return "T_Customer [CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", RelationName="
				+ RelationName + ", RelationPhone=" + RelationPhone + ", Address=" + Address + ", Email=" + Email
				+ ", Remark=" + Remark + "]";
	}
	
}
