package com.user;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
	static int mynum=100;
	String firstName,lastName,username,password,address,country,state,zip,nameOnCard,exp,cvv;
	long cardNum;
	int custNum;
	double total;
    Date purschasedate;
	ArrayList<Car> soldCarArray=new ArrayList();

	public Customer(String firstName, String lastName, String username, String password, String address, String country,
			String state, String zip, String nameOnCard, String exp, String cvv, long cardNum) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.address = address;
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.nameOnCard = nameOnCard;
		this.exp = exp;
		this.cvv = cvv;
		this.cardNum = cardNum;
		

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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public long getCardNum() {
		return cardNum;
	}
	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}
	public int getCustNum() {
		return custNum;
	}
	public void setCustNum() {

		this.custNum = ++mynum;
	}

	public ArrayList<Car> getSoldCarArray() {
		return soldCarArray;
	}

	//Add purchased car to arraylist of customer sold cars	
	public void setSoldCarArray(Car car) {

		this.soldCarArray.add(car);
	}

	public double totalSold() {

		for(Car car: soldCarArray) {

			total+=car.getPrice();
		}
		return total;
	}

}
