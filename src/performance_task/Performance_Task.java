package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter launch velocity (m/s): ");
		double lv = inKey.nextDouble();
		
		System.out.println("Enter launch angle (degrees): ");
		double la = inKey.nextDouble();
		
		System.out.println("Projectile's path: ");
		
		int time = 0;
		double x = 0;
		double y = 0;
		
		do {
			System.out.println("Time: " + time + "s");
			
			x= Math.cos(Math.toRadians(la))*time* lv;
			y = Math.sin(Math.toRadians(la))* time * lv - 0.5 *9.8 * Math.pow(time,2);
			if(y< 0) {
				break;
				
			}
			
			System.out.println("\tx-pos: " + x + "m");
			System.out.println("\ty-pos: " + y + "m");
			
			time++;
			
		} while (y>=0);
		
		System.out.println("\tx-pos: " + x + "m");
		System.out.println("\ty-pos: 0m" );
		
		
		
		
	}
	
}
