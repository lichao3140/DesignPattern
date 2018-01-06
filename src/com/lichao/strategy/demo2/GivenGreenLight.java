package com.lichao.strategy.demo2;

/**
 * 实现类---ConcreteStrategy
 * @author LiChao
 *
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
         System.out.println("求吴国太开个绿灯，放行");
    }
}
