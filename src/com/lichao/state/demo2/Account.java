package com.lichao.state.demo2;

/**
 * Context类，维护一个ConcreteState子类的实例
 * 这个实例定义当前的状态。
 * @author LiChao
 *
 */
public class Account {
	private State state;
    private String owner;
    
    public Account(String owner) {
    	// 新开账户默认为 Silver状态
        this.owner = owner;
        this.state = new SilverState(0.0, this);
    }
    
    public State getState() {
    	return state;
    }
    
    public void setState(State state) {
    	this.state = state;
    }
    
    /**
     * 存入金额
     * @param amount
     */
    public void deposit(double amount) {
    	state.deposit(amount);
		System.out.println(owner + "存入金额:" + amount);
		System.out.println(owner + "总金额 =" + state.getBalance());
		System.out.println("用户状态 = " + state.getClass().getSimpleName());
		System.out.println("==============================================");
    }
    
    /**
     * 支出金额
     * @param amount
     */
    public void withdraw(double amount) {
    	state.withdraw(amount);
    	System.out.println(owner + "支出金额:" + amount);
		System.out.println(owner + "总金额 =" + state.getBalance());
		System.out.println("用户状态 = " + state.getClass().getSimpleName());
		System.out.println("==============================================");
    }
    
    /**
     * 利息
     */
    public void payInterest() {
    	state.payInterest();
        System.out.println(owner + "利息");
        System.out.println(owner + "总金额 =" + state.getBalance());
		System.out.println("用户状态 = " + state.getClass().getSimpleName());
		System.out.println("==============================================");
    }
}
