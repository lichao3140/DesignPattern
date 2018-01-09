package com.lichao.memoto.demo1;

/**
 * ʹ���ٻ���Ϸ
 * @author LiChao
 *
 */
public class CallOfDuty {
	private int mCheckpoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "ɳĮ֮ӥ";
	
	/**
	 * ����Ϸ
	 */
	public void play() {
		System.out.println("����Ϸ:" + String.format("��%d��", mCheckpoint) + "�ܶ�ɱ����");
		mLifeValue -= 10;
		System.out.println("����������");
		mCheckpoint++;
		System.out.println("����:" + String.format("��%d��", mCheckpoint));
	}
	
	/**
	 * �˳���Ϸ
	 */
	public void quit() {
		System.out.println("--------------------");
		System.out.println("�˳���ǰ��Ϸ����:" + this.toString());
		System.out.println("�˳���Ϸ");
		System.out.println("--------------------");
	}
	
	/**
	 * ��������¼
	 * @return
	 */
	public Memoto createMemoto() {
		Memoto memoto = new Memoto();
		memoto.mCheckpoint = mCheckpoint;
		memoto.mLifeValue = mLifeValue;
		memoto.mWeapon = mWeapon;
		return memoto;
	}
	
	/**
	 * �ָ���Ϸ
	 * @param memoto
	 */
	public void restore(Memoto memoto) {
		this.mCheckpoint = memoto.mCheckpoint;
		this.mLifeValue = memoto.mLifeValue;
		this.mWeapon = memoto.mWeapon;
		System.out.println("�ָ���Ϸ����:" + this.toString());
	}

	@Override
	public String toString() {
		return "CallOfDuty [mCheckpoint=" + mCheckpoint + ", mLifeValue="
				+ mLifeValue + ", mWeapon=" + mWeapon + "]";
	}
}
