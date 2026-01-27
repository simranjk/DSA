// Naive approach ------------------------>


 public class MaxSumOfKConsecutive {

  static int maxConsecutiveSum(int[] arr, int n) {
    int maxSum=Integer.MIN_VALUE;
    int k=2;

    for(int i=0; i+k-1<n; i++){
      int sum=0;
      for(int j=0; j<k; j++){
        sum+=arr[i+j];
        maxSum=Math.max(maxSum, sum);
      }
    }

    return maxSum;
  }

  public static void main(String[] args){
    int[] arr = {5,-10,6,90,3};
    int n=5;
    int max_sum=maxConsecutiveSum(arr,n);
    System.out.print(max_sum);
  }
}



// Efficient approach -------------------->
//Sliding Window

public class MaxSumOfKConsecutive {

  static int maxConsecutiveSum(int[] arr, int n) {

    int k = 2;
    int currSum=0;
    //first window
    for (int i = 0; i < k; i++) {
      currSum+=arr[i];
    }

    int maxSum=currSum;
    //slide the window
    for(int i=k; i<n; i++){
      currSum+= arr[i]- arr[i-k];
      maxSum=Math.max(maxSum, currSum);
    }
    return maxSum;
  }


  public static void main(String[] args){
    int[] arr = {5,-10,6,90,3};
    int n=5;
    int max_sum=maxConsecutiveSum(arr,n);
    System.out.print(max_sum);
  }

}
