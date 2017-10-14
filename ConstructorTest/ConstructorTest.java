import java.util.*;

public class ConstructorTest{
    public static void main(String args[]){
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        
        staff[0] = new Employee("Jhye", 10000);
        staff[1] = new Employee(8000);
        staff[2] = new Employee();

        // print out information about all Employee objects
        for(Employee each : staff){
            System.out.println(each.getName() + " " + each.getId() + " " + each.getSalary());
        }
    }
}

class Employee{
    private static int nextId;

    private String name = "";  // instance field initialization
    private int id;
    private double salary;

    // static initialization block
    static{
        Random generator = new Random();
        // set nextId to a random number between 0 and 999
        nextId = generator.nextInt(1000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary){
        this("Employee #"+nextId, salary);
    }

    public Employee(){
        // name initialized to "" --see above
        // salary not explicitly set --initialized to 0
        // id initialized in initialization block
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public double getSalary(){
        return this.salary;
    }
}