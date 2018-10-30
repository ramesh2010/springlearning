package com.nallamothu.spring.learn.model;

public class Address {
	String street;
	String city;
	String state;
	int zip;

	public Address() {
		System.out.println("--> in Address constructor <--");
	}

	public Address(String city, String state, int zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;

		System.out.println("--> in Address with city=" + city + " constructor <--");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("--> set Address city=" + city + " <--");
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

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

	public void myInit() {
		System.out.println("--> Address " + getStreet() + " initialized <--");
	}

	public void myDestroy() {
		System.out.println("--> Address " + getStreet()  + " destroyed <--");
	}
}
