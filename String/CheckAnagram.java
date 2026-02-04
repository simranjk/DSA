//Naive approach ----------------------->

import java.util.Arrays;

public class CheckAnagram {
  public static void main(String[] args) {
    String s1 = "abaac";
    String s2 = "aacba";

    System.out.print(isAnagram(s1,s2));
  }

  public static boolean isAnagram(String s1, String s2) {

    if(s1.length()!=s2.length()){
      return false;
    }

    char c1[] = s1.toCharArray();
    char c2[] =s2.toCharArray();

    Arrays.sort(c1);
    Arrays.sort(c2);

    s1= new String(c1);
    s2= new String(c2);

    if (s1.equals(s2)){
      return true;
    }
    return false;
  }
}
