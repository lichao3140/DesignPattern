package com.lichao.strategy.demo1;

/**
 * 公交车价格计算策略
 * @author LiChao
 *
 */
public class BusStrategy implements CalculateStrategy {

	/**
	 * 10公里之内1元，超过10公里之后每加1元可以乘5公里
	 */
	@Override
	public int calculatePrice(int km) {
		// 超过10公里的总距离
		int extraTotal = km - 10;
		// 超过的距离是5公里的倍数
		int extraFactor = extraTotal / 10;
		// 超过的距离对5公里取余
		int fraction = extraTotal % 5;
		// 价格计算
		int price = 1 + extraFactor * 1;
		return fraction > 0 ? ++price : price;
	}

}
