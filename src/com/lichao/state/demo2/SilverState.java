package com.lichao.state.demo2;

/**
 * 用户账户银色状态:SilverState
 * @author LiChao
 * ConcreteState类，具体状态，每一个子类实现一个与
 * Context的一个状态相关的行为。
 */
public class SilverState extends State {
	
	public SilverState(State state) {
    	this(state.balance, state.account);
    }
	
	public SilverState(double balance, Account account) {
		this.balance = balance;
		this.account = account;
		initialize();
    }
	
	/**
	 * 模拟初始化基础数据
	 */
	private void initialize() {
		interest = 0.0;
	    lowerLimit = 0.0;
	    upperLimit = 1000.0;
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
	
	private void stateChangeCheck() {
		if (balance < lowerLimit) {
			account.setState(new RedState(this));
		} else if (balance > upperLimit) {
			account.setState(new GoldState(this));
		}
	}
}
