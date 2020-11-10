package com.service;

public class RoomClass {
	private int roomno;
	private String roomtype;
	private int roomarea;
	private Acmachine acmachine;

	public void setData(int roomno, String roomtype, int roomarea, Acmachine acmachine) {
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		this.acmachine = acmachine;
	}

	public void displayData() {
		System.out.println("ROOM DETAILS:");
		System.out.println(roomno);
		System.out.println(roomtype);
		System.out.println(roomarea);
		System.out.println("AC DETAILS:");
		acmachine.displayData();
	}
}
