package com.user;

import java.util.ArrayList;

public class Dealership {

	ArrayList<Car> carArray=new ArrayList<Car>();
	

	
public Dealership() {
	
	//create cars for dealership
			createCars();	
	
	}



public ArrayList<Car> getcarArray() {
	return carArray;
}



public void setcarArray(ArrayList<Car> carArray) {
	this.carArray = carArray;
}
//create cars and add them to array list cars
public void createCars() {
	
	Car car1=new Car("New","Lexus","GS 450","Great Ride",2017,11234,20000,".\\images\\img1.jpg",100);
	Car car2=new Car("Used","Honda","Accord","Like New Condition",2016,734,18000,".\\images\\img2.jpg",101);
	Car car3=new Car("New","Hundai","Santa Fe","Great 7 Seats",2010,8464,7699,".\\images\\img3.jpg",102);
	Car car4=new Car("Used","Mazda","CX-9","Runs Great",2017,0363,23573,".\\images\\img4.jpg",103);
	Car car5=new Car("New","Toyota","Rav 4","Brand NEW",2018,7364,19456,".\\images\\img5.jpg",104);
	Car car6=new Car("New","Nissan","Rogue","New Tires",2011,23644,13634,".\\images\\img6.jpg",105);
	Car car7=new Car("Used","Chevy","Silverando","Slighty Used",2016,9354,24763,".\\images\\img7.jpg",106);
	Car car8=new Car("New","Ford","Fusion","Low Miles",2017,74563,18643,".\\images\\img8.jpg",107);
	Car car9=new Car("New","Audi","A6","Best Condition",2009,8465,24763,".\\images\\img9.jpg",108);
	Car car10=new Car("New","Toyota","Camry","Nice toyota",2010,94756,17563,".\\images\\img10.jpg",109);	
	
	carArray.add(car1);
	carArray.add(car2);
	carArray.add(car3);
	carArray.add(car4);
	carArray.add(car5);
	carArray.add(car6);
	carArray.add(car7);
	carArray.add(car8);
	carArray.add(car9);
	carArray.add(car10);
	//set dates
	for(Car i: carArray) {
		
		i.setInventoryDate("5/5/2018");
		
	}
	//set three cars with dates older than 120
	car1.setInventoryDate("15/1/2018");
	car5.setInventoryDate("1/3/2017");
	car7.setInventoryDate("1/1/2018");
	
	
	
}
	
}