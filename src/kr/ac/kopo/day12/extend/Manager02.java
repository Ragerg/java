package kr.ac.kopo.day12.extend;

public class Manager02 extends Employee {
	
	Employee[] empList;   
	
	
	public Manager02() {
		
	}
	
	public Manager02(int no, String name, int salary, String grade, Employee[] empList) {
//		super.no = no;
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
		
	}
	
	public void info() {
//		System.out.println("사번 : " + no + ", 이름 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
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
