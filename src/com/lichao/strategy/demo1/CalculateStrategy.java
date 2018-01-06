package com.lichao.strategy.demo1;

/**
 * 计算接口
 * @author LiChao
 *
 */
public interface CalculateStrategy {
	
	/**
	 * 按距离计算价格
	 * @param km 公里
	 * @return  返回价格
	 */
	int calculatePrice(int km);
}
