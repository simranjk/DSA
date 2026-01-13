//Naive approach -------------------->

 class LeadersInAnArray
{
  /*Java Function to print leaders in an array */
  void printLeaders(int arr[], int size)
  {
    for (int i = 0; i < size; i++)
    {
      int j;
      for (j = i + 1; j < size; j++)
      {
        if (arr[i] <=arr[j])
          break;
      }
      if (j == size) // the loop didn't break
        System.out.print(arr[i] + " ");
    }
  }

  /* Driver program to test above functions */
  public static void main(String[] args)
  {
    LeadersInAnArray lead = new LeadersInAnArray();
    int arr[] = new int[]{16, 17, 4, 3, 5, 2};
    int n = arr.length;
    lead.printLeaders(arr, n);
  }
}



//Optimal approach -------------------->

public class LeadersInAnArray {
  static void printLeaders(int arr[], int n){
    if (n == 0) {
      // nothing to print
      return;
    }
    int rightMax=arr[n-1];
    System.out.print(rightMax+ " ");
    for(int i=n-2; i>0; i--){
      if (rightMax<arr[i]){
        rightMax=arr[i];
        System.out.print(rightMax + " ");
      }
    }
  }

  public static void main(String[] args)
  {
    LeadersInAnArray lead = new LeadersInAnArray();
    int arr[] = new int[]{16, 17, 4, 3, 5, 2};
    int n = arr.length;
    lead.printLeaders(arr, n);
  }
}
