public class StaticTest{
	public static void main(String[] args){
		// fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Jhye", 10000);
		staff[1] = new Employee("Bird", 8000);
		staff[2] = new Employee("Wsp", 9000);
		
		// print out information about all Employee objects
		for(Employee each : staff){
			each.setId();
			System.out.println("name=" + each.getName() + ", id=" + each.getId() + ", salary=" + each.getSalary());
		}
		int n = Employee.getNextId();  // calls static method
		System.out.println("Next available id=" + n);
	}
}

class Employee{
	private static int nextId = 1;

	private String name;
	private double salary;
	private int Id;

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

	public int getId(){
		return this.Id;
	}
	
	public void setId(){
		this.Id = nextId;
		nextId++;
	}

	public static int getNextId(){
		return nextId;
	}

	public static void main(String[] args){
		Employee e = new Employee("Jhye", 10000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}