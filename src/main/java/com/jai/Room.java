package com.jai;

public class Room {
	private int sno;
	private String roomName;
	private int roomNo;
	private String floor;
	private String building;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public Room(int sno, String roomName, int roomNo, String floor, String building) {
		super();
		this.sno = sno;
		this.roomName = roomName;
		this.roomNo = roomNo;
		this.floor = floor;
		this.building = building;
	}

	@Override
	public String toString() {
		return "Room [sno=" + sno + ", roomName=" + roomName + ", roomNo=" + roomNo + ", floor=" + floor + ", building="
				+ building + "]";
	}
}
