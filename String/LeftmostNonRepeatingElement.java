
//Naive approach --------------------->

public class LeftmostNonRepeatingElement {

  static int isNotRepeating(String str) {
    for (int i = 0; i < str.length(); i++) {
      boolean flag = true;

      for (int j = 0; j < str.length(); j++) {
        if (i != j && str.charAt(i) == str.charAt(j)) {
          flag = false;
          break;
        }
      }

      if (flag) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String str = "abcbc";
    System.out.print(isNotRepeating(str));
  }

}
