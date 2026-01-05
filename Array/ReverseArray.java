public class ReverseArray {
  static void reverseArray(int[] arr, int start, int end){
    int temp;
    while(start<end){
      temp = arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }

  }
  public static void main(String[] args) {

    int arr[] = {1, 2, 3, 4, 5, 6};
    int n=arr.length;

    reverseArray(arr, 0, n-1);

    System.out.print("Reversed array is: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}

