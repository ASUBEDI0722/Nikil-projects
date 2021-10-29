package com.ektha.bcj.overriding;

public class Developer extends Employee {

	public Developer() {
	}

	double bonusPercent = 0.1;

	public double getSalary() {

		salary = 3000;

		double totalSalary = salary + salary * bonusPercent;

		return totalSalary;
	}

}
