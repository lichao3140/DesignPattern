package com.lichao.memoto.demo1;

public class Client {
	
	public static void main(String[] args) {
		//������Ϸ����
		CallOfDuty game = new CallOfDuty();
		//����Ϸ
		game.play();
		
		Caretaker caretaker = new Caretaker();
		//��Ϸ�浵
		caretaker.archive(game.createMemoto());
		//�˳���Ϸ
		game.quit();
		//�ָ���Ϸ
		CallOfDuty newGame = new CallOfDuty();
		newGame.restore(caretaker.getMemoto());
	}
}
