
//Naive approach --------------------->

public class MaxCircularSubArray {
  static int maxCircularSum(int[] arr, int n) {
    int res=arr[0];

    for(int i=0; i<n; i++){
      int currMax=arr[i];
      int maxSum=arr[i];

      for(int j=1; j<n; j++){
        int index =(i+j) % n;
        currMax = currMax+arr[index];
        maxSum = Math.max(maxSum, currMax);
      }
      res = Math.max(res,maxSum);
    }
    return res;
  }

  public static void main(String [] args){
    int arr[] = {8, -8, 9, -9, 10, -11, 12}, n = 7;
    System.out.println(maxCircularSum(arr, n));
  }


}
