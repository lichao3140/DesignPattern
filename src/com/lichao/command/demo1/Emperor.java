package com.lichao.command.demo1;

public class Emperor {
	
	public static void main(String[] args) {
		General general = new General();
		general.attach();
		general.undo();
	}
}
