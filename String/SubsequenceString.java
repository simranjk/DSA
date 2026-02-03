//Iterative approach ----------------------->

public class SubsequenceString {
  public static void main(String[] args) {
    String s1 = "abdefgh";
    String s2 = "afh";
    int n=s1.length();
    int m=s2.length();

    System.out.print(isSubsequent(s1,s2, n, m));
  }

  public static boolean isSubsequent(String s1, String s2, int n, int m) {

    int j=0;

    for(int i=0; i<n && j<m; i++)
    {
      if(s1.charAt(i)==s2.charAt(j)) {
        j++;
      }

    }
    return j == m;

  }
}
