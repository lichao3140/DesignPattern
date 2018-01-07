package com.lichao.context.demo1;

/**
 * ���ֽ�����  ����Ϊ�˽�������
 * @author LiChao
 *
 */
public class NumExpression extends ArithmeticExpression {
	private int num;
	
	public NumExpression(int num) {
		this.num = num;
	}

	@Override
	public int interpret() {
		return num;
	}

}
