package com.lichao.iterator.modle;

import java.util.ArrayList;
import java.util.List;

/**
 * ¾ßÌåÈİÆ÷Àà
 * @author LiChao
 *
 * @param <T>
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
	private List<T> list = new ArrayList<T>();

	@Override
	public void add(T obj) {
		list.add(obj);
	}

	@Override
	public void remove(T obj) {
		list.remove(obj);
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteIterator<>(list);
	}

}
