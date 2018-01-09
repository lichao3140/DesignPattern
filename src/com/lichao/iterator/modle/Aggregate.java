package com.lichao.iterator.modle;

/**
 * 容器接口
 * @author LiChao
 *
 */
public interface Aggregate<T> {
	/**
	 * 添加一元素
	 * @param obj
	 */
	void add(T obj);
	
	/**
	 * 移除一个元素
	 * @param obj
	 */
	void remove(T obj);
	
	/**
	 * 获取容器的迭代器
	 * @return 迭代器对象
	 */
	Iterator<T> iterator();
}
