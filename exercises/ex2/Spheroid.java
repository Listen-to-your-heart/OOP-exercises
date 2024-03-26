package exercise2;

import java.util.Scanner;
public class Spheroid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter equatorial radius in km: ");
		double a = input.nextDouble();
		System.out.print("Enter polar radius in km: ");
		double c = input.nextDouble(); 
		
		double e = Math.sqrt(1 - Math.pow(c, 2) / Math.pow(a, 2));
		double V = 4 * Math.PI * Math.pow(a, 2) * c / 3;
		System.out.printf("Eccentricity = %.3g\n", e);
		System.out.printf("Volume = %g cubic km", V);
		
		input.close();
	}
}
