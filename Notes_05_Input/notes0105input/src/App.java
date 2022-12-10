import java.util.Scanner;

public class App {
    
        //Coding Notes for Notes 1.05 - Input

//Need to import Scanner to use it

	public static void main(String[] args) {
		//Create a Scanner object -- called "in"
		Scanner in = new Scanner(System.in);
		

		// Part 1: Reading Doubles
		//
		System.out.println("Enter a number to multiply: ");
		double a = in.nextDouble(); //read the number
		in.nextLine(); //This line is used to clean the "input buffer"
		
		System.out.println("Enter another number: ");
		double b = in.nextDouble();
		in.nextLine();
		
		double product = a * b;
		System.out.println("The product is: " + product);
		
		// Part 2: Reading Name
		// There will be a buffer skip behavior if Part 1 did not
		//  use a .nextLine() command after the .nextDouble() commands
		String name;
		System.out.println("What is your name?");
		name = in.nextLine();
		
		//Print out name
		System.out.println("Hello, " + name);

		// Part 3: Reading 3 numbers at once
		//
		System.out.println("Enter 3 integers (with spaces): ");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		in.nextLine();
		
		//Print out the numbers entered
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		

	}

}
    

