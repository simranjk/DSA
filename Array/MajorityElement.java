//Naive approach -------------------------->

public class MajorityElement {

  static int findMajority(int arr[], int n)
  {
    for(int i = 0; i < n; i++)
    {
      int count = 1;

      for(int j = i + 1; j < n; j++)
      {
        if(arr[i] == arr[j])
          count++;
      }

      if(count > n / 2)
        return arr[i];
    }

    return -1;
  }


  public static void main(String args[]) {
    int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4}, n = 9;

    System.out.println(findMajority(arr, n));


  }}
