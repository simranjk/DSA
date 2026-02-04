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


//Efficient approach ------------------------>

public class CheckAnagram {

  static final int CHAR=256;

  static boolean areAnagram(String s1, String s2)
  {

    if (s1.length() != s2.length())
      return false;

    int[] count=new int[CHAR];
    for(int i=0;i<s1.length();i++){
      count[s1.charAt(i)]++;
      count[s2.charAt(i)]--;
    }

    for(int i=0;i<CHAR;i++){
      if(count[i]!=0)return false;
    }
    return true;
  }

  public static void main(String args[])
  {
    String str1 = "abaac";
    String str2 = "aacba";
    if (areAnagram(str1, str2))
      System.out.println("The two strings are"
        + " anagram of each other");
    else
      System.out.println("The two strings are not"
        + " anagram of each other");
  }
}
