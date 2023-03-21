package kr.ac.kopo.day11.stat;

public class EmployeeMain01 {
	
	public static void main(String[] args) {
		
		Employee.employeeCntInfo();
		
		Employee e = new Employee(1, "홍길동", 3_400, "사원");
		Employee e2= new Employee(2, "고길동", 3_700, "주임");
		Employee e3= new Employee(3, "임길동", 3_500, "사원");
		
		e.info();
		e2.info();
		e3.info();
		
		Employee.employeeCntInfo();
		
		
		
		
		
		
		
		
		
		
	}
}
