package com.lichao.subject.demo2;

/**
 * ��
 * @author LiChao
 *
 */
public class People implements Buy_Car {
	private int cash;
	private String vip;
	private String username;

	@Override
	public void buy_mycar() {
		 System.out.print(username + "��vip �ͻ�������ֱ�ӹ����³���");  
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
