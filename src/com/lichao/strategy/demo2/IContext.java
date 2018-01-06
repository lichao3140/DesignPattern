package com.lichao.strategy.demo2;

/**
 * 环境类---Context
 * @author LiChao
 *
 */
public class IContext {
	 private IStrategy strategy;
     //构造函数，要你使用哪个妙计
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
