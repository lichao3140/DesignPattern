package com.lichao.iterator.demo1;

public class Client {
	
	public static void main(String[] args) {
		CompanyHr hr = new CompanyHr();
		check(hr.iterator());
		
		CompanyIt it = new CompanyIt();
		check(it.iterator());
	}
	
	private static void check(Iterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}
