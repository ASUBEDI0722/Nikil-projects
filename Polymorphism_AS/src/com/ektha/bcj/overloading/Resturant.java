package com.ektha.bcj.overloading;

public class Resturant {

	public static void main(String[] args) {
		double salesTax = 0;
		double subTotal = 0;
		double tax = 0;
		double totalAmount = payBill(subTotal, tax);
		System.out.println("Total Amount is " + totalAmount);

		double totalAmount1 = payBill(subTotal, tax, salesTax);
		System.out.println("Total amount with salesTax is " + totalAmount1);
	}

	public static double payBill(double subTotal, double tax) {
		subTotal = 53.25;
		tax = 5.33;
		double totalBill = subTotal + tax;
		return totalBill;
	}

	public static double payBill(double subTotal, double tax, double salesTax) {
		subTotal = 53.25;
		tax = 5.33;
		salesTax = 1.55;
		double totalBill = subTotal + tax + salesTax;
		return totalBill;

	}
}
