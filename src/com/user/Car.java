package com.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Car {
	String make, model, description, condition, img;
	int year, millage, price,carId;
	String solddate;
	String status;

	// Date dateNow=new Date();

	// date received variable
	Date inventoryDate;
	// formart date from string to date
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// setter change date from string to date obj
	public void setInventoryDate(String inventoryDate) {
		try {

			this.inventoryDate = sdf.parse(inventoryDate);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getSolddate() {

		return solddate;

	}

	public void setSolddate(String solddate) {
		this.solddate = solddate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInventoryDate() {
		return sdf.format(inventoryDate);
	}

	// Constructor
	public Car(String condition, String make, String model, String description, int year, int millage, int price,
			String img, int carId) {

		this.make = make;
		this.model = model;
		this.description = description;
		this.year = year;
		this.millage = millage;
		this.condition = condition;
		this.price = price;
		this.img = img;
		this.carId = carId;
		this.status = "Available";
		// this.inventoryDate=setInventoryDate(model)
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car() {

	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMillage() {
		return millage;
	}

	public void setMillage(int millage) {
		this.millage = millage;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {

		return this.year + " " + this.make + " " + this.model + " " + this.millage + " " + this.description;

	}

	// calculate how many days cars have been in inventory
	public boolean getcarAge() {

		// Minus the max days the car can be idle on the lot from todays day
		LocalDateTime date = LocalDateTime.now().minusDays(120);
		// Converting the inventory date to a localDateTime so both data type are the
		// same
		LocalDateTime convertedInventoryDate = LocalDateTime.ofInstant(inventoryDate.toInstant(),
				ZoneId.systemDefault());

		// Checking to see if the cut off date is after the inventory day
		// if the cut off date is after the inventory date then this car is within the
		// cut off limit
		// if the date is not after the inventory date then this car is over 120 days
		// from the inventory date.
		return date.isAfter(convertedInventoryDate);

	}

}
