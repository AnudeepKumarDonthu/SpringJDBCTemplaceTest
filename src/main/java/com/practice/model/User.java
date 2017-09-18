/**
 * 
 */
package com.practice.model;

/**
 * @author AnudeepKumar
 *
 */
public class User {

	private int userId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {

		return "Id: " + this.getUserId() + "First Name: " + this.getFirstName() + "Last Name: " + this.getLastName()
				+ "Address: " + this.getAddress() + "City: " + this.getCity();
	}

}
