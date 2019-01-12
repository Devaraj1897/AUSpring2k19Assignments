package com.company;

public class Address {
    private int door_no;
    private String street;
    private String locality;
    private String city;
    private String state;
    private int pincode;
	public int getDoor_no() {
		return door_no;
	}
	public void setDoor_no(int door_no) {
		this.door_no = door_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [door_no=" + door_no + ", street=" + street + ", locality=" + locality + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
    
}
