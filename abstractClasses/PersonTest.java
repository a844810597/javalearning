package abstractClasses;

public class PersonTest{
	public static void main(String[] args){
		Person[] people = new Person[2];

		// fill the people array with Student and Employee objects
		people[0] = new Employee("Jhye", 10000, 1997, 12, 3);
		people[1] = new Student("Wujie", "Software Engineering");
		
		// print out names and description of all Person objects
		for(Person p : people){
			System.out.println(p.getName() + ", " + p.getDescription());
		}
	}
}
