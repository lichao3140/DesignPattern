package com.lichao.state.demo2;

/**
 * �û��˻���ɫ״̬:GoldState
 * @author LiChao
 * ConcreteState�࣬����״̬��ÿһ������ʵ��һ����
 * Context��һ��״̬��ص���Ϊ��
 */
public class GoldState extends State {
	
	public GoldState(State state) {
		this(state.balance, state.account);
	}
	
	public GoldState(double balance, Account account) {
		this.balance = balance;
	    this.account = account;
	    initialize();
	}
	
	/**
	 * ģ���ʼ����������
	 */
	private void initialize() {
		interest = 0.05;
	    lowerLimit = 1000.0;
	    upperLimit = 10000000.0;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	    stateChangeCheck();
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	    stateChangeCheck();
	}

	@Override
	public void payInterest() {
		balance += interest * balance;
	    stateChangeCheck();
	}
	
	/**
	 * ״̬���
	 */
	private void stateChangeCheck() {
		if (balance < 0.0) {
			account.setState(new RedState(this));
		} else if (balance < lowerLimit) {
			account.setState(new SilverState(this));
		}
	}
}
