package com.main;

import com.service.Acmachine;
import com.service.RoomClass;

/**
 * Write a program to create a room class, the attributes of this class is
 * roomno, roomtype, roomarea and ACmachine. In this class the member functions
 * are setdata and displaydata.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class RoomClassMain {

	public static void main(String[] args) {
		RoomClass roomClass1 = new RoomClass();
		Acmachine acmachine1 = new Acmachine(16, "Voltas", 75000);
		roomClass1.setData(0, "Seminar", 45, acmachine1);
		RoomClass roomClass2 = new RoomClass();
		Acmachine acmachine2 = new Acmachine(25, "Samsung", 95000);
		roomClass2.setData(1, "Classroom", 100, acmachine2);
		roomClass1.displayData();
		roomClass2.displayData();
	}

}
