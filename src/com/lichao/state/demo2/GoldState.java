package com.lichao.state.demo2;

/**
 * 用户账户金色状态:GoldState
 * @author LiChao
 * ConcreteState类，具体状态，每一个子类实现一个与
 * Context的一个状态相关的行为。
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
	 * 模拟初始化基础数据
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
	 * 状态检测
	 */
	private void stateChangeCheck() {
		if (balance < 0.0) {
			account.setState(new RedState(this));
		} else if (balance < lowerLimit) {
			account.setState(new SilverState(this));
		}
	}
}
