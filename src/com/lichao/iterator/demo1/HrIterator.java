package com.lichao.iterator.demo1;

import java.util.List;

/**
 * »À ¬≤ø
 * @author LiChao
 *
 */
public class HrIterator implements Iterator {
	private List<Employee> list;
	private int position;
	
	public HrIterator(List<Employee> list) {
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		return !(position > list.size() - 1 || list.get(position) == null);
	}

	@Override
	public Object next() {
		Employee e = list.get(position);
		position++;
		return e;
	}

}
