package com.PackageTest;

import com.jhye.corejava.*;
// the Employee class is defined in that package

import static java.lang.System.*;

public class PackageTest{
	public static void main(String[] args){
		//because of the import statement, we don't have to use com.jhye.corejava.Employee here
		Employee jhye = new Employee("Jhye", 10000, 2017, 10, 11);
		
		jhye.raiseSalary(5);

		// because of the  static import statement, we don't have to use System.ou here
		out.println("name=" + jhye.getName() + " salary=" + jhye.getSalary());
	}
}
