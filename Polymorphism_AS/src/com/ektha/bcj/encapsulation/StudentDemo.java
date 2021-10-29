package com.ektha.bcj.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudentId(1);
		student.setStudentFirstName("Anamika");
		student.setStudentLastName("Subedi");
		student.setStudentEmail("asubedi@gmail.com");

//		System.out.println("Id: " + student.getStudentId());
//		System.out.println("FirstName : " + student.getStudentFirstName());
//		System.out.println("LastName : " + student.getStudentLastName());
//		System.out.println("Email :" + student.getStudentEmail());

		System.out.println(student);

	}

}
