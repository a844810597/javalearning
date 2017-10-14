public class ParamTest{
	public static void main(String[] args){
		/* 
		 * Test 1: Method can't modify numeric parameters
		 */
		System.out.println("Testing tripleValue: ");
		double percent = 10;
		System.out.println("Before: percent = " + percent);
		tripleValue(percent);
		System.out.println("After: percent = " + percent);

		/* 
		 * Test 2: Methods can change the state of object parameters
		 */
		System.out.println("\nTesting tripleSalary:");
		Employee jhye = new Employee("Jhye", 10000);
		System.out.println("Before: salary = " + jhye.getSalary());
		tripleSalary(jhye);
		System.out.println("After: salary = " + jhye.getSalary());

		/*
		 * Test 3: Methods can't attach new objects to object parameters
		 */
		System.out.println("\nTesting swap:");
		Employee a = new Employee("jhye", 10000);
		Employee b = new Employee("bird", 8000);
		System.out.println("Before a = " + a.getName());
		System.out.println("Before b = " + b.getName());
		swap(a, b);
		System.out.println("After a = " + a.getName());
		System.out.println("After b = " + b.getName());
	}
	public static void tripleValue(double x){  // Doesn't work
		x = 3 * x;
		System.out.println("End of method: x = " + x);
	}
	public static void tripleSalary(Employee x){  // Works
		x.raiseSalary(200);
		System.out.println("End of method: x = " + x.getSalary());
	}
	public static void swap(Employee x, Employee y){
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x = " + x.getName());
		System.out.println("End of method: y = " + y.getName());
	}
}

class Employee{
	private String name;
	private double salary;
	
	public Employee(String n, double s){
		this.name = n;
		this.salary = s;
	}

	public String getName(){
		return this.name;
	}
	
	public double getSalary(){
		return this.salary;
	}

	public void raiseSalary(double byPercent){
		double raise = this.getSalary() * byPercent;
		this.salary += raise;
	}
}