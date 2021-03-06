package com.ektha.bcj.overriding;

public class EmployeeDemo {

	public static void main(String[] args) {

		Manager manager = new Manager();
		System.out.println("Salary of manager with bonus: " + manager.getSalary());

		Developer developer = new Developer();
		System.out.println("Salary of developer with bonus: " + developer.getSalary());

		Employee employee = new Employee();
		System.out.println("Salary of regular employee: " + employee.getSalary());
	}

}
