package com.lichao.context.demo1;

/**
 * 减法运算抽象解释器
 * @author LiChao
 *
 */
public class SubtractionExpression extends OperatorExpression {

	public SubtractionExpression(ArithmeticExpression exp1,
			ArithmeticExpression exp2) {
		super(exp1, exp2);
	}

	@Override
	public int interpret() {
		return exp1.interpret() - exp2.interpret();
	}

}
