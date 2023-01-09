package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
	
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int first = inKey.nextInt();
		
		System.out.println("Enter another positive integer");
		int second = inKey.nextInt();
		
		System.out.println(first + "^" + second + " = " + Math.pow(first, second) + "\n"); 
		
		
	}
	
	
	
	public static void problem2() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int input = inKey.nextInt();
		
		System.out.println("The square root of " + input + " is " + Math.sqrt(input));
			
	}
	
	
	
	public static void problem3() {
		
		System.out.println ("Give me the sides for a right triangle ");
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Length of side A: ");
		int sideA = inKey.nextInt();
		
		int second = 2;
		
		System.out.println("Length of side B: ");	
		int sideB = inKey.nextInt();
		
		
		
		int sideAB = sideA + sideB;
		
		System.out.println("Hypotenuse = " + Math.pow(sideA, second) + 
				Math.pow(sideB, second)   );
		
		
	}
	
	
	
	public static void problem4() {
		
		
	
}
	
}
