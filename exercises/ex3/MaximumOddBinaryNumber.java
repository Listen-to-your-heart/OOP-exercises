import java.util.Scanner;
public class MaximumOddBinaryNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("s = ");
    String s = input.nextLine();

    // Count the number of '1's in the string.
    int countOnes = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        countOnes++;
      }
    }

    char[] result = new char[s.length()];
    java.util.Arrays.fill(result, '0');

    // Set the last character to '1' to ensure it's an odd number.
    result[s.length() - 1] = '1';

    // Fill the beginning of the array with '1's.
    for (int i = 0; i < countOnes - 1; i++) {
      result[i] = '1';
    }

    System.out.println(result);

    input.close();
  }
}
