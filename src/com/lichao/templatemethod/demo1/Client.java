package com.lichao.templatemethod.demo1;

public class Client {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.prepareGotoSchool();
		
		Teacher teacher  = new Teacher();
		teacher.prepareGotoSchool();
	}
}
