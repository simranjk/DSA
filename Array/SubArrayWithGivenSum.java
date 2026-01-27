public class SubArrayWithGivenSum {

  static boolean subArrayWithSum(int[] arr, int n, int sum) {

    int currSum = 0;
    int start = 0;

    for (int end = 0; end < n; end++) {

      currSum += arr[end];

      while (currSum > sum && start <= end) {
        currSum -= arr[start];
        start++;
      }

      if (currSum == sum) {
        System.out.println("Sum found between indexes " + start + " and " + end);
        return true;
      }
    }

    System.out.println("No subArray found");
    return false;
  }

  public static void main(String[] args) {

    int arr[] = {1, 4, 20, 3, 10, 5};
    int sum = 33;

    subArrayWithSum(arr, arr.length, sum);
  }
}

