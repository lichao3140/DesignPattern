package com.lichao.iterator.demo1;

import java.util.ArrayList;
import java.util.List;

public class CompanyHr implements Company {
	private List<Employee> list = new ArrayList<>();

	public CompanyHr() {
		list.add(new Employee("����", 23, "��", "����"));
		list.add(new Employee("����", 20, "Ů", "����"));
		list.add(new Employee("�ܲ�", 60, "��", "ة��"));
		list.add(new Employee("�����", 30, "��", "��ʦ"));
		list.add(new Employee("��٢", 66, "��", "���"));
	}
	
	public List<Employee> getEmployees() {
		return list;
	}
	
	@Override
	public Iterator iterator() {
		return new HrIterator(list);
	}

}
