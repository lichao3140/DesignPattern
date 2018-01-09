package com.lichao.iterator.demo1;

/**
 * Èí¼þ²¿
 * @author LiChao
 *
 */
public class ItIterator implements Iterator {
	private Employee[] array;
	private int position;
	
	public ItIterator(Employee[] array) {
		this.array = array;
	}
	
	@Override
	public boolean hasNext() {
		return !(position > array.length - 1 || array[position] == null);
	}

	@Override
	public Object next() {
		Employee e = array[position];
		position++;
		return e;
	}

}
