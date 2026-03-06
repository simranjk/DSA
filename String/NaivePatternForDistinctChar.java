public class NaivePatternForDistinctChar {
  static void search(String text, String pattern) {

      int n = text.length();
      int m = pattern.length();
      int i = 0;

      while (i <= n - m) {
        int j = 0;
        while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
          j++;
        }
        if (j == m) {
          System.out.print(i + " ");
        }
        // Optimized shift for distinct characters
        if (j == 0) {
          i++;
        } else {
          i += j;
        }
      }
  }

    public static void main(String[] args) {
      String text = "ABCABCD";
      String pattern = "ABCD";

      search(text, pattern);
    }
  }

