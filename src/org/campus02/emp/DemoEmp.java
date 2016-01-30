package org.campus02.emp;

import java.util.ArrayList;

public class DemoEmp {

	public static void main(String[] args) {

		Employee steve = new Employee(001, "Moser", 3_000.0, "HR");
		Employee dominik = new Employee(002, "Geiger", 2_800.0, "IS");
		Employee dave = new Employee(003, "Erlacher", 2_500.0, "IS");
		Employee boss = new Employee(999, "Chefe", 10_000.0, "ZERO");
		
		ArrayList<Employee> list = new ArrayList<>();
		
		EmployeeManager manage = new EmployeeManager(list); 
		manage.addEmployee(steve);
		manage.addEmployee(dominik);
		manage.addEmployee(dave);
		manage.addEmployee(boss);
		
		System.out.println(manage.findByEmpNumber(001));
		System.out.println(manage.findByMaxSalary());
		System.out.println(manage.findByDepartment("IS"));
		System.out.println(manage.printList());
		
	}

}
