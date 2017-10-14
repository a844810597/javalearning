package com.jhye.corejava;

// the classes in this file are part of this package

import java.time.*;

// import statements come after the package statement

public class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String name, double salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	public Employee(){

	}

	public String getName(){
		return this.name;
	}

	public double getSalary(){
		return this.salary;
	}

	public LocalDate getHireDay(){
		return this.hireDay;
	}

	public void raiseSalary(double byPercent){
		double raise = this.salary * byPercent;
		this.salary += raise;
	}
}