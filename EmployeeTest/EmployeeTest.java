import java.time.*;

public class EmployeeTest{
	public static void main(String[] args){

		// fill the staff array with three Emloyee objects
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Jhye", 10000.00, 2017, 10, 1);
		staff[1] = new Employee("WSP", 12000.00, 2017, 9, 30);
		staff[2] = new Employee("bird", 8000.00, 2017, 9, 29);

		for(Employee each : staff){
			System.out.println(each.getName() + " " + each.getSalary() + " " + each.getHireDay().toString());
		}
		
		for(Employee each : staff){
			each.raiseSalary(10);
		}

		for(Employee each : staff){
			System.out.println(each.getName() + " " + each.getSalary() + " " + each.getHireDay().toString());
		}

	}
}

class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;

	// 构造函数
	public Employee(String name, double salary, int year, int month, int dayOfMonth){
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, dayOfMonth);
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