package com.lichao.memoto.demo1;

/**
 * ������� Memoto
 * @author LiChao
 *
 */
public class Caretaker {
	//����¼
	Memoto mMemoto;
	
	/**
	 * �浵
	 */
	public void archive(Memoto memoto) {
		this.mMemoto = memoto;
	}
	
	/**
	 * ��ȡ�浵
	 * @return
	 */
	public Memoto getMemoto() {
		return mMemoto;
	}
}
