package com.lichao.state.demo2;

/**
 * 用户账户红色状态:RedState
 * @author LiChao
 * ConcreteState类，具体状态，每一个子类实现一个与
 * Context的一个状态相关的行为。
 */
public class RedState extends State {
	
	private double serviceFee;
	
	public RedState(State state) {
		this.balance = state.getBalance();
		this.account = state.getAccount();
		initialize();
	}
	
	/** 模拟初始化基础数据*/
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
		System.out.println("要取出的金额已经超出存款卡里金额!");
	}

	@Override
	public void payInterest() {
		
	}
	
	/**
	 * 状态检测
	 */
	private void stateChangeCheck() {
		if (balance > upperLimit) {
			account.setState(new SilverState(this));
		}
	}
}
