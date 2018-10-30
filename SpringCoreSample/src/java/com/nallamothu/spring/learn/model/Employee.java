package com.nallamothu.spring.learn.model;

// this is Bean / Model / POJO(Plain Old Java Object) class
public class Employee {

	// attributes
	int eid;
	String fname;
	String mname;
	String lname;

	Address address;

	// methods
	public Employee() {
		System.out.println("--> in Employee constructor <--");
	}

	// constructor injection
	public Employee(Address address) {
		this.address = address;
		System.out.println("--> in Employee constructor with Address <--");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
		System.out.println("--> set fname=" + fname + " <--");
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("--> set Address for " + this.getFname() + " <--");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", address="
				+ address + "]";
	}

	public void myInit() {
		System.out.println("--> Employee " + getFname() + " initialized <--");
	}

	public void myDestroy() {
		System.out.println("--> Employee " + getFname() + " destroyed <--");
	}
}
