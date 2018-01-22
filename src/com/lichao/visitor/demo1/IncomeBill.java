package com.lichao.visitor.demo1;

/**
 * 收入单子
 * @author LiChao
 *
 */
public class IncomeBill implements Bill {
	private String item;
    private double amount;
    
    public IncomeBill(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

	@Override
	public void accept(AccountBookView viewer) {
		viewer.view(this);
	}

	public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }
}
