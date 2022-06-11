package com.constructor;

public class TestEmp {
	public static void main(String[] args) {
		
		Employee  employee=new Employee(101, 52000,"Shikhar");
		Employee  employee1=new Employee(102, 53000,"Shankar");
		Employee  employee2=new Employee(103, 54000,"ramesh");
		Employee  employee3=new Employee(104, 62000,"rakesh");

		employee.toString();
		employee.calculateWage9(3);
	}

}
