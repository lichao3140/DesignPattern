package com.lichao.strategy.demo2;

/**
 * ʵ����---ConcreteStrategy
 * @author LiChao
 *
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
         System.out.println("�����̫�����̵ƣ�����");
    }
}
