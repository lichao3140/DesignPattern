package com.lichao.state.demo2;

/**
 * �û��˻���ɫ״̬:RedState
 * @author LiChao
 * ConcreteState�࣬����״̬��ÿһ������ʵ��һ����
 * Context��һ��״̬��ص���Ϊ��
 */
public class RedState extends State {
	
	private double serviceFee;
	
	public RedState(State state) {
		this.balance = state.getBalance();
		this.account = state.getAccount();
		initialize();
	}
	
	/** ģ���ʼ����������*/
	private void initialize() {
		interest = 0.0;
		lowerLimit = -100.0;
		upperLimit = 0.0;
		serviceFee = 15.00;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	    stateChangeCheck();
	}

	@Override
	public void withdraw(double amount) {
		amount = amount - serviceFee;
		System.out.println("Ҫȡ���Ľ���Ѿ�����������!");
	}

	@Override
	public void payInterest() {
		
	}
	
	/**
	 * ״̬���
	 */
	private void stateChangeCheck() {
		if (balance > upperLimit) {
			account.setState(new SilverState(this));
		}
	}
}
