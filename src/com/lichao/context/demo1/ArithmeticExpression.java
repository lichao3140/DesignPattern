package com.lichao.context.demo1;

/**
 * 抽象的算术运算解释器
 * 为所有解释器共性的提取
 * @author LiChao
 *
 */
public abstract class ArithmeticExpression {
	/**
	 * 抽象的解析方法
	 * 具体的解析逻辑由具体的子类实现
	 * @return  解析得到具体的值
	 */
	public abstract int interpret();
}
