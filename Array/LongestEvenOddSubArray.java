
//Naive approach -------------------------->

public class LongestEvenOddSubArray {
  static int maxEvenOdd(int arr[], int n)
  {
    int res = 1;

    for(int i = 0; i < n; i++)
    {
      int curr = 1;

      for(int j = i + 1; j < n; j++)
      {
        if((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0)
          ||(arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
          curr++;
        else
          break;
      }

      res = Math.max(res, curr);
    }

    return res;
  }

  public static void main(String args[]){
    int arr[] = {1, 2, 3, 4, 5, 7, 9} , n = 5;
    System.out.print(maxEvenOdd(arr, n));

  }

}




//Efficient approach ----------------------->

public class LongestEvenOddSubArray {

  public static int maxEvenOdd(int[] arr, int n) {
    if (n == 0) {
      return 0;
    }

    int maxLength = 1;
    int currLen = 1;

    for (int i = 1; i < n; i++) {
      if (arr[i] % 2 != arr[i - 1] % 2) {
        currLen++;
      } else {
        maxLength = Math.max(maxLength, currLen);
        currLen = 1;
      }
    }
    maxLength = Math.max(maxLength, currLen);
    if (maxLength == 1) {
      return 0;
    }
    return maxLength;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 3, 7, 2, 9, 4 };
    int n = arr.length;
    System.out.println("Length of longest subarray of even and odds is : " +
      maxEvenOdd(arr, n));
  }

}