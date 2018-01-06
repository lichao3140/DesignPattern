package com.lichao.state.demo2;

/**
 * Context�࣬ά��һ��ConcreteState�����ʵ��
 * ���ʵ�����嵱ǰ��״̬��
 * @author LiChao
 *
 */
public class Account {
	private State state;
    private String owner;
    
    public Account(String owner) {
    	// �¿��˻�Ĭ��Ϊ Silver״̬
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
     * ������
     * @param amount
     */
    public void deposit(double amount) {
    	state.deposit(amount);
		System.out.println(owner + "������:" + amount);
		System.out.println(owner + "�ܽ�� =" + state.getBalance());
		System.out.println("�û�״̬ = " + state.getClass().getSimpleName());
		System.out.println("==============================================");
    }
    
    /**
     * ֧�����
     * @param amount
     */
    public void withdraw(double amount) {
    	state.withdraw(amount);
    	System.out.println(owner + "֧�����:" + amount);
		System.out.println(owner + "�ܽ�� =" + state.getBalance());
		System.out.println("�û�״̬ = " + state.getClass().getSimpleName());
		System.out.println("==============================================");
    }
    
    /**
     * ��Ϣ
     */
    public void payInterest() {
    	state.payInterest();
        System.out.println(owner + "��Ϣ");
        System.out.println(owner + "�ܽ�� =" + state.getBalance());
		System.out.println("�û�״̬ = " + state.getClass().getSimpleName());
		System.out.println("==============================================");
    }
}
