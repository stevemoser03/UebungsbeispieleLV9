package org.campus02.emp1;

import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee> list = new ArrayList<>();

	public EmployeeManager(ArrayList<Employee> list) {
		super();
		this.list = list;
	}
	
	public void addEmployee(Employee e){
		list.add(e);
	}
	
	public Employee findByMaxSalary(){
		double max = 0.0;
		Employee found = null;
		for (Employee e : list) {
			if(e.getSalary()>max){
				max = e.getSalary();
				found = e;
			}
		}
		return found;
	}
	
	public Employee findByEmpNumber(int number){
		Employee found = null;
		for (Employee e : list) {
			if(e.getEmpNumber() == number){
				found = e;
			}
		}
		return found;
	}
	
	
	public ArrayList<Employee> findByDepartment(String department){
		
		ArrayList<Employee> empTemp = new ArrayList<>();
		
		for (Employee e : list) {
			if(e.getDepartment().equals(department)){
				empTemp.add(e);
			}
		}
		return empTemp;
	}
	

}
