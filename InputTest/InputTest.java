import java.util.*;
import java.io.*;

public class InputTest
{
	public	static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		//get first input
		System.out.print("What is your name? ");
		String name = in.nextLine();

		//get seconde input
		System.out.print("How old are you?");
		int age = in.nextInt();

		//display output on console
		System.out.println("Hello, " + name +". Next year, you'll be " + (age + 1));

		Console cons = System.console();
		String username = cons.readLine("User name: ");
		char[] password = cons.readPassword("Password: ");

		System.out.println("User name: " + username);
		System.out.println("Passward: " + password.toString());
	}
}