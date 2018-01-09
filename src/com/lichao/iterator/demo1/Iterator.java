package com.lichao.iterator.demo1;

public interface Iterator {
	/**
	 * 是否还有下一个元素
	 * @return true有，false没有
	 */
	boolean hasNext();
	
	/**
	 * 返回当前元素，并将位置至下一位
	 * @return
	 */
	Object next();
}
