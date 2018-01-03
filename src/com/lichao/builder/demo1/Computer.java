package com.lichao.builder.demo1;

/**
 * ����������࣬��Product��ɫ
 * @author LiChao
 *
 */
public abstract class Computer {
	protected String mBoard;
	protected String mDisplay;
	protected String mOS;
	
	protected Computer() {
		
	}

	//��������
	public void setBoard(String mBoard) {
		this.mBoard = mBoard;
	}

	//������ʾ��
	public void setDisplay(String mDisplay) {
		this.mDisplay = mDisplay;
	}

	//���ò���ϵͳ
	public abstract void setOS();

	@Override
	public String toString() {
		return "Computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay
				+ ", mOS=" + mOS + "]";
	}
	
	
}
