package com.lichao.context.demo1;

import java.util.Stack;

/**
 * �����������ص�һЩҵ��
 * @author LiChao
 *
 */
public class Calculator {
	//����һ��stackջ�洢������������صĽ�����
	private Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();
	
	public Calculator(String expression) {
		//��������ArithmeticExpression���͵���ʱ�������洢������������ߵ����ֽ�����
		ArithmeticExpression exp1, exp2;
		
		//���ݿո�ָ���ʽ�ַ���
		String[] elements = expression.split(" ");
		
		/*������������ʽ����:a+b-c)�����յ��﷨�����£�
         *           -
         *         /   \
         *       +     c
         *     /   \
         *    a     b
         */
		for (int i = 0; i < elements.length; i++) {
			//�ж��������
			switch (elements[i].charAt(0)) {
			case '+'://����ǼӺ�
				//��ջ�еĽ�����������Ϊ���������ߵĽ�����
				exp1 = mExpStack.pop();
				
				//��������������±���һ��Ԫ�ع���Ϊһ�����ֽ�����
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));
				
				//ͨ�������������ֽ���������ӷ����������
				mExpStack.push(new AdditionExpression(exp1, exp2));
				break;
			case '-':
				exp1 = mExpStack.pop();
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));
				mExpStack.push(new SubtractionExpression(exp1, exp2));
				break;

			default://���������
				/**
				 * ��������������Ϊ���֣�ֱ�ӹ������ֽ�������ѹ��ջ
				 */
				mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
				break;
			}
		}
	}
	
	/**
	 * ������
	 * @return
	 */
	public int calculate() {
		return mExpStack.pop().interpret();
	}
}
