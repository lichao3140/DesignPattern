package com.lichao.strategy.demo2;

/**
 * ������---Context
 * @author LiChao
 *
 */
public class IContext {
	 private IStrategy strategy;
     //���캯����Ҫ��ʹ���ĸ����
     public IContext(IStrategy strategy) {
          this.strategy = strategy;
     }
     public void setStrategy(IStrategy strategy){
          this.strategy = strategy;
     }
     public void operate(){
          this.strategy.operate();
     }
}
