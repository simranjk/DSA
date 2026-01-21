
//Efficient approach ------------------------->

public class MaxSubArraySum {
  public static int maxSum(int arr[], int n){
    int res=arr[0];
    int max=arr[0];

    for (int i=1; i<n; i++){
      max= Math.max(max + arr[i], arr[i]);
      res = Math.max(res,max);
    }
    return res;
  }



  public static void main(String[] args) {
    int[] arr = {-3, 8, -2, 4, -5, 6};
    int n = 6;

    int res = maxSum(arr, n);
    System.out.println(res);
  }
}
