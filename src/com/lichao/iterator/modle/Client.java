package com.lichao.iterator.modle;

public class Client {
	
	public static void main(String[] args) {
		Aggregate<String> a = new ConcreteAggregate<>();
		a.add("java");
		a.add("python\n");
		a.add("php");
		a.add("C++");
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
