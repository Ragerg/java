package kr.ac.kopo.day12.extend;

public class Manager03 extends Employee {
	
	Employee[] empList;   
	
	
	public Manager03() {
		
	}
	
	public Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade); // Employee에 있는 생성자를 호출
		this.empList = empList;
		
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("---------------------------------------------");
		System.out.println("\t\t< 관리사원 리스트 >");
		System.out.println("---------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("---------------------------------------------");
	}

}
