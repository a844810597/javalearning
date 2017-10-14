package inheritance;

public class ManagerTest{
	public static void main(String[] args){
		// construct a Manager object
		Manager boss = new Manager("Jhye", 10000, 1997, 12, 3);
		boss.setBonus(5000);
		
		// fill the staff array with Manager and Employee objects
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Bird", 5000, 1989, 10, 1);
		staff[2] = new Employee("Wsp", 4000, 1990, 3, 15);

		// print out information about all Employee objects
		for(Employee e : staff){
			System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay().toString());
		}
	}
}