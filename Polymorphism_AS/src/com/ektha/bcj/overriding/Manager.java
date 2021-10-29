package com.ektha.bcj.overriding;

public class Manager extends Employee {

	double bonusPercent = 0.2;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {

		salary = 4000;
		double totalSalary = salary + salary * bonusPercent;
		return totalSalary;
	}

}
