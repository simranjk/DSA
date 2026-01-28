class EquilibriumIndex {

  static int equilibriumIndex(int[] arr) {
    int n = arr.length;

    int[] prefix = new int[n];
    int[] suffix = new int[n];

    prefix[0] = arr[0];
    for (int i = 1; i < n; i++)
      prefix[i] = prefix[i - 1] + arr[i];

    suffix[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--)
      suffix[i] = suffix[i + 1] + arr[i];

    // Check equilibrium
    for (int i = 0; i < n; i++) {
      int leftSum = 0;
      int rightSum = 0;

      if (i > 0) {
        leftSum = prefix[i - 1];
      }
      if (i < n - 1) {
        rightSum = suffix[i + 1];
      }
      if (leftSum == rightSum) {
        return arr[i];
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
    System.out.println(equilibriumIndex(arr));
  }
}
