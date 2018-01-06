package com.lichao.strategy.demo2;

/**
 * 实现类---ConcreteStrategy
 * @author LiChao
 *
 */
public class BlackEnemy implements IStrategy {
    @Override
    public void operate() {
         System.out.println("孙夫人断后，挡住追兵");
    }
}
