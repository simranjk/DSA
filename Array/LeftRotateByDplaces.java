
//Naive approach -------------------->

public class LeftRotateByDplaces {

    static void lRotateOne(int arr[], int n)
    {
      int temp = arr[0];

      for(int i = 1; i < n; i++)
      {
        arr[i - 1] = arr[i];
      }

      arr[n - 1] = temp;
    }

    static void leftRotate(int arr[], int d, int n)
    {
      for(int i = 0; i < d; i++)
      {
        lRotateOne(arr, n);
      }
    }

    public static void main(String args[])
    {
      int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

      System.out.println("Before Rotation");

      for(int i = 0; i < n; i++)
      {
        System.out.print(arr[i]+" ");
      }

      System.out.println();

      leftRotate(arr, d, n);

      System.out.println("After Rotation");

      for(int i = 0; i < n; i++)
      {
        System.out.print(arr[i]+" ");
      }

    }

}



//better approach -------------------->

public class LeftRotateByDplaces {

  static void leftRotate(int arr[], int d, int n)
  {
    int temp[] = new int[d];

    for(int i = 0; i  < d; i++)
    {
      temp[i] = arr[i];
    }
    for(int i = d; i  < n; i++)
    {
      arr[i - d] = arr[i];
    }
    for(int i = 0; i  < d; i++)
    {
      arr[n - d + i] = temp[i];
    }
  }

  public static void main(String args[])
  {
    int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

    System.out.println("Before Rotation");

    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i]+" ");
    }

    System.out.println();

    leftRotate(arr, d, n);

    System.out.println("After Rotation");

    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i]+" ");
    }

  }
}



//Optimal approach -------------------->

class LeftRotateByDplaces {

  static void reverse(int arr[], int start, int end) {
    while(start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void leftRotate(int arr[], int d, int n) {
    if (d == 0) return;
    d = d % n;
    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
  }

  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

    System.out.println("Before Rotation");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    leftRotate(arr, d, n);

    System.out.println("\nAfter Rotation");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}