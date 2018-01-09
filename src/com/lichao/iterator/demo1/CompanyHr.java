package com.lichao.iterator.demo1;

import java.util.ArrayList;
import java.util.List;

public class CompanyHr implements Company {
	private List<Employee> list = new ArrayList<>();

	public CompanyHr() {
		list.add(new Employee("吕布", 23, "男", "将军"));
		list.add(new Employee("貂蝉", 20, "女", "美人"));
		list.add(new Employee("曹操", 60, "男", "丞相"));
		list.add(new Employee("诸葛亮", 30, "男", "军师"));
		list.add(new Employee("华佗", 66, "男", "大夫"));
	}
	
	public List<Employee> getEmployees() {
		return list;
	}
	
	@Override
	public Iterator iterator() {
		return new HrIterator(list);
	}

}
