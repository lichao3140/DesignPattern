package com.lichao.iterator.modle;

/**
 * 迭代器接口
 * @author LiChao
 *
 * @param <T>
 */
public interface Iterator<T> {
	/**
	 * 是否还有下一个元素
	 * @return  true有，false没有
	 */
	boolean hasNext();
	
	/**
	 * 返回当前位置的元素并将位置移至下一位
	 * @return
	 */
	T next();
}
