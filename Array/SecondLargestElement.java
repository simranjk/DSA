
//NAIVE APPROACH O(nlogn) -------------------->

public class SecondLargestElement {
    static int getSecondLargest(int[] arr){
      int n=arr.length;
      int res=-1;
      for(int i=0; i<n; i++){
        if(arr[i]!=arr[getLargest(arr)]){
          if(res==-1){
            res=i;
          } else if (arr[i]>arr[res]) {
            res=i;
          }
        }
      }
      return res;
    }
    static int getLargest(int arr[]){

      int largest=0;
      for(int i=0; i<arr.length; i++){
        if (arr[i]>arr[largest]){
          largest=i;
        }
      }
      return largest;
    }
    public static void main(String[] args){
      int []arr=  {12, 35, 1, 10, 34, 1};
      int n= arr.length;
      System.out.print("Second Largest Element is " +getSecondLargest(arr));
    }
}






//EFFICIENT APPROACH O(n) -------------------->

public class SecondLargestElement {
  static int getSecondLargest(int[] arr, int n) {

    int largest = Integer.MIN_VALUE;
    int secLargest = Integer.MIN_VALUE;

    if (n < 2) {
      System.out.println("Invalid Input");
      return -1;
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] > largest) {
        secLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secLargest && arr[i] != largest) {
        secLargest = arr[i];
      }
    }
    return secLargest;
  }


  public static void main(String[] args){
    int arr[] = { 12, 45, 1, 10, 38, 1 };
    int n = arr.length;
    System.out.print("The second largest element"
      + " is " + getSecondLargest(arr,n));
  }

}

