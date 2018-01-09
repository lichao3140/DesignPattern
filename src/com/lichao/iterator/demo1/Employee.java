package com.lichao.iterator.demo1;

/**
 * 员工实体类
 * @author LiChao
 *
 */
public class Employee {
	private String name;
	private int age;
	private String sex;
	private String position;
	
	public Employee(String name, int age, String sex, String position) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", position=" + position + "]";
	}
}
