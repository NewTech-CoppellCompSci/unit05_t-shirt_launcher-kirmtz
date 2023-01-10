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
		
		
		System.out.println("Length of side B: ");	
		int sideB = inKey.nextInt();
		
		double hypo = Math.sqrt(Math.pow(sideA,  2) + Math.pow(sideB,  2));
		System.out.println("Hypotenuse = " + hypo);
		
		
	}
	
	
	
	public static void problem4() {
		
		Scanner inKey = new Scanner(System.in);
		
		boolean z = false;
		
		int usern = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(usern != 0) {
			System.out.println("Enter any number : ");
			usern = inKey.nextInt();
			
			max = Math.max(max, usern);
			min = Math.min(min,  usern);
			if (usern == 0) {
				break;
			}
		}
				
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
	
}
	
}
