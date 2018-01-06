package com.lichao.builder.demo2;

public class WorkBuilder implements Build {
	
	private Room room=new Room();
	@Override
	public void makeWindow() {
		room.setFloor("�ذ�  ");
	}

	@Override
	public void makeFloor() {
		room.setWindow("����");
	}

	@Override
	public Room getRoom() {
		return room;
	}

}
