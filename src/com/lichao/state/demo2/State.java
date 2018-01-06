package com.lichao.state.demo2;

/**
 * State类，抽象状态类，定义一个接口以封装
 * 与Context的一个特定状态相关的行为。 
 * @author LiChao
 *
 */
public abstract class State {
	
	protected Account account;
	protected double balance;

	protected double interest;
	protected double lowerLimit;
	protected double upperLimit;
	 
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**存入金额*/
	public abstract void deposit(double amount);
	
	/**支出金额*/
	public abstract void withdraw(double amount);
	
	/**利息*/
	public abstract void payInterest();
}
