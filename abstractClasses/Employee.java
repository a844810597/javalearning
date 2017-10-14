package abstractClasses;

import java.time.*;

public class Employee extends Person{
	private double salary;
	private LocalDate hireDay;

	public Employee(String name, double salary, int year, int month, int day){
		super(name);
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
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

	public String getDescription(){
		return String.format("an employee with a salary of $%.2f", this.salary);	
	}
}