package com.lichao.templatemethod.model;

public class Client {

	public static void main(String[] args) {
		AbstractComputer comp = new CoderComputer();
		comp.startUP();
		
		comp = new MilitaryComputer();
		comp.startUP();
	}
}
