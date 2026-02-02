//Naive approach

public class PalindromeCheck {
  public static boolean isPalindrome(String str) {
    StringBuilder rev = new StringBuilder(str);
    rev.reverse();
    return str.equals(rev.toString());
  }

  public static void main(String[] args) {
    String str = "abc";
    System.out.print(isPalindrome(str));
  }
}
