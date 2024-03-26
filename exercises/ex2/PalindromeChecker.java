package exercise2;

import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String in = input.nextLine();
		char[] array = in.toCharArray();
		int len = array.length;
		
		boolean flag = true;
		for(int i = 0; i < len / 2; i++) {
			if(array[i] != array[len - i - 1]) {
				flag = false;
			}
			if(flag == false) break;
		}
		
		if(flag == true) {
			System.out.print("The string is a palindrome.");
		}else {
			System.out.print("The string is not a palindrome.");
		}
		
		input.close();
	}

}
