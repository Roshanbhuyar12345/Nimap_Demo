package com.encapsulation;

public class Main {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmpId(12458);
		System.out.println(employee.getEmpId());
		
		Employee employee1 = new Employee();

		employee1.setEmpId(101201);
		System.out.println(employee1.getEmpId());
	}
}