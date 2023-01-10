package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int int1 = inKey.nextInt();
		
		System.out.println(" Enter another positive integer: ");
		int int2 = inKey.nextInt();
		
		int max = Math.max(int1,  int2);
		int min = Math.min(int1, int2);
		
		for (int i = 0; i < 100; i ++) {
			System.out.print(((int) (Math.random() * (max - min + 1)) + min) +  " ");
		}
		
	
		
	}


	public static void problem2() {
		
		Scanner inKey  = new  Scanner(System.in);
		
		System.out.println("\n Enter the cylinder's radius: ");
		double radius = inKey.nextDouble();
		System.out.println("Enter the cylinders height: ");
		double height = inKey.nextDouble();
		
		double cv = Math.PI * Math.pow(radius, 2 ) * height;
		
		System.out.print("Enter the cylinders volume: " + cv);
		
		
	}


	public static void problem3() {
		
		
	}

	
	
	public static void problem4() {
		
		
	}



}
