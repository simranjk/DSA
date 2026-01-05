Naive approach ------------------------>

public class IsSorted {
  static boolean isSorted(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int arr[] = {8, 10, 10, 12};
    int n = arr.length;

    System.out.println(isSorted(arr, n));
  }
}





//Efficient approach ------------------------>

public class IsSorted{

  static boolean arraySortedOrNot(int arr[], int n)
  {

    if (n == 0 || n == 1)
      return true;

    for (int i = 1; i < n; i++) {
      // Unsorted pair found
      if (arr[i - 1] > arr[i]) {
        return false;
      }
    }
    // No unsorted pair found
    return true;
  }

  public static void main(String[] args)
  {

    int arr[] = { 10, 23, 20, 45, 78, 88 };
    int n = arr.length;

    if (arraySortedOrNot(arr, n))
      System.out.print("Yes\n");
    else
      System.out.print("No\n");
  }

}