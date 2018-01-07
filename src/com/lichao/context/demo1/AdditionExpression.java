package com.lichao.context.demo1;

/**
 * �ӷ�������������
 * @author LiChao
 *
 */
public class AdditionExpression extends OperatorExpression {

	public AdditionExpression(ArithmeticExpression exp1,
			ArithmeticExpression exp2) {
		super(exp1, exp2);
	}

	@Override
	public int interpret() {
		return exp1.interpret() + exp2.interpret();
	}

}
