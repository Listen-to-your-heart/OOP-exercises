package exercise1;

import java.util.Scanner;
class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if( ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0)
			System.out.print("It is a leap year");
		
		else System.out.print("It is not a leap year"); 
	}

}
