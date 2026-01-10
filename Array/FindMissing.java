public class FindMissing {
    static int findMissing(int[] arr, int n) {
      for (int i = 1; i <= n; i++) {
        boolean found = false;
        for (int j = 0; j < arr.length; j++) {
          if (arr[j] == i) {
            found = true;
            break;
          }
        }
        if (!found) return i;
      }
      return -1;
    }

    public static void main(String[] args) {
      int[] arr = {1, 2, 4, 5};
      int n = 5;

      System.out.println("The missing number is: " + findMissing(arr, n));
    }
  }

