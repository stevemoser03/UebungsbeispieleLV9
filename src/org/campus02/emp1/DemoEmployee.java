package org.campus02.emp1;

import java.util.ArrayList;

public class DemoEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(001,"emp1",1_000.0,"HR");
		Employee emp2 = new Employee(002,"emp2",3_000.0,"HR");
		Employee emp3 = new Employee(003,"emp3",5_000.0,"IS");
		Employee emp4 = new Employee(004,"emp4",1_300.0,"IS");
		Employee emp5 = new Employee(005,"emp5",4_900.0,"HR");
		
		ArrayList<Employee> list = new ArrayList<>();
		
		EmployeeManager manage = new EmployeeManager(list);
		
		manage.addEmployee(emp1);
		manage.addEmployee(emp2);
		manage.addEmployee(emp3);
		manage.addEmployee(emp4);
		manage.addEmployee(emp5);
		
		System.out.println(manage.findByDepartment("HR"));
		System.out.println(manage.findByEmpNumber(004));
		System.out.println(manage.findByMaxSalary());
		
		
		
	}

}
