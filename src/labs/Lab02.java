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
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\n Enter x1");
		double x1 = inKey.nextDouble();
		
		System.out.println(" Enter y1 ");
		double y1 = inKey.nextDouble();
		
		System.out.println("Enter x2: ");
		double x2 =  inKey.nextDouble();
		
		System.out.println("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		System.out.println("Distance between points = " + distance);
		
		
	}

	
	
	public static void problem4() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\n Enter a-value: ");
		double a = inKey.nextDouble();
		
		System.out.println("Enter a b-value: ");
		double b = inKey.nextDouble();
		
		System.out.println("Enter c-value: ");
		double c = inKey.nextDouble();
		
		double p = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println( "x1 = " + p);
		double m = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("x2 = " + m);
		
		
		
		
		
		
	}



}
