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


  }
}




//Efficient approach ------------------------>

public class MajorityElement {
  static int findMajority(int arr[], int n)
  {
    int res = 0, count = 1;

    for(int i = 1; i < n; i++)
    {
      if(arr[res] == arr[i])
        count++;
      else
        count --;

      if(count == 0)
      {
        res = i; count = 1;
      }
    }

    count = 0;

    for(int i = 0; i < n; i++)
      if(arr[res] == arr[i])
        count++;

    if(count <= n /2)
      res = -1;

    return arr[res];
  }


  public static void main(String args[])
  {
    int arr[] = {8, 8, 6, 6, 6, 4, 6}, n = 7;

    System.out.println(findMajority(arr, n));

  }
}