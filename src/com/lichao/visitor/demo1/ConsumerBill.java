package com.lichao.visitor.demo1;

/**
 * ���ѵ���
 * @author LiChao
 *
 */
public class ConsumerBill implements Bill {
	private String item;
    private double amount;

    public ConsumerBill(String item, double amount) {
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
