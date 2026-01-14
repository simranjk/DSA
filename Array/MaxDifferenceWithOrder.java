//Naive approach -------------------->

class MaxDifferenceWithOrder {
  int maxDiff(int arr[], int arr_size)
  {
    int max_diff = arr[1] - arr[0];
    int i, j;
    for (i = 0; i < arr_size; i++)
    {
      for (j = i + 1; j < arr_size; j++)
      {
        if (arr[j] - arr[i] > max_diff)
          max_diff = arr[j] - arr[i];
      }
    }
    return max_diff;
  }

  /* Driver program to test above functions */
  public static void main(String[] args)
  {
    MaxDifferenceWithOrder maxdif = new MaxDifferenceWithOrder();
    int arr[] = {1, 2, 90, 10, 110};
    System.out.println("Maximum difference is " +
      maxdif.maxDiff(arr, 5));
  }
}



//Optimal approach --------------------->

public class MaxDifferenceWithOrder {
  static int maxDifference(int arr[], int n){
    int maxDif= arr[1]-arr[0];
    int minElement=arr[0];

    for(int i=1; i<n; i++){
      if(arr[i]-minElement>maxDif){
        maxDif=arr[i]-minElement;
      }
      if (arr[i]<minElement){
        minElement = arr[i];
      }
    }
    return maxDif;
  }

  public static void main(String[] args){
    MaxDifferenceWithOrder maxdif = new MaxDifferenceWithOrder();
    int arr[] = {2,3,10,6,4,8,1};
    int n=arr.length;
    maxDifference(arr,n);
    System.out.print("Maximum difference is "+maxdif.maxDifference(arr,n));
  }
}
