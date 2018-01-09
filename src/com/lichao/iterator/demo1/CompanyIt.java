package com.lichao.iterator.demo1;

public class CompanyIt implements Company {
	private Employee[] array = new Employee[3];

	public CompanyIt() {
		array[0] = new Employee("ÇÇ²¼Ë¹", 23, "ÄÐ", "CEO");
		array[1] = new Employee("±È¶û¸Ç´Ä", 20, "ÄÐ", "CEO");
		array[2] = new Employee("Ôú¿Ë²®¸ñ", 30, "ÄÐ", "CEO");
	}
	
	public Employee[] getEmployees() {
		return array;
	}
	
	@Override
	public Iterator iterator() {
		return new ItIterator(array);
	}

}
