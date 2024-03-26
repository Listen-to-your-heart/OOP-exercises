package exercise1;

import java.util.Scanner;
class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in kilograms: ");
		double kilograms = input.nextDouble();
		double oz = kilograms * 35.273962;
		double lb = oz / 16;
		oz = oz % 16;
		System.out.printf("Equivalent imperial weight is %d lb %.1f oz", (int)lb, oz);
		
	}

}
