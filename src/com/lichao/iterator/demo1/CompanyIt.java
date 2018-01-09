package com.lichao.iterator.demo1;

public class CompanyIt implements Company {
	private Employee[] array = new Employee[3];

	public CompanyIt() {
		array[0] = new Employee("�ǲ�˹", 23, "��", "CEO");
		array[1] = new Employee("�ȶ��Ǵ�", 20, "��", "CEO");
		array[2] = new Employee("���˲���", 30, "��", "CEO");
	}
	
	public Employee[] getEmployees() {
		return array;
	}
	
	@Override
	public Iterator iterator() {
		return new ItIterator(array);
	}

}
