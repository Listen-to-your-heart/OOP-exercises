import java.util.Scanner;
public class CheckPassword {
  public static boolean longEnough(String password) {
    return password != null && password.length() >= 12;
  }

  public static boolean atLeastTwoDigits(String password) {
    if (password == null) {
      return false;
    }

    int digitCount = 0;
    for (int i = 0; i < password.length(); i++) {
      if (Character.isDigit(password.charAt(i))) {
        digitCount++;
        if (digitCount >= 2) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      // no input
      System.err.println("Usage: java CheckPassword <password>");
      System.exit(1);
    }

    String password = args[0];
    // check whether valid
    boolean isValid = longEnough(password) && atLeastTwoDigits(password);

    System.out.println("Password is " + (isValid ? "valid" : "not valid"));
  }

}
