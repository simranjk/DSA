//Naive approach ------------------->

public class LeftmostRepeatingChar {
  static int isRepeating(String str){
    for(int i=0; i<str.length(); i++){
      for(int j=i+1; j<str.length(); j++){
        if(str.charAt(i)==str.charAt(j)){
          return i;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String str = "abcbc";
    System.out.print(isRepeating(str));
  }
}



//Better approach -------------------->



public class LeftmostRepeatingChar {
  static int isRepeating(String str){

    int CHAR =256;
    int count[]=new int[CHAR];

    for(int i=0; i<str.length(); i++){
      count[str.charAt(i)]++;
    }
    for(int i=0; i<str.length(); i++){
      if (count[str.charAt(i)]>1){
        return i;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    String str = "abcbc";
    System.out.print(isRepeating(str));
  }
}




//Efficient approach ------------------------>


import java.util.Arrays;
class LeftmostRepeatingChar {
  static final int CHAR=256;
  static int leftMost(String str)
  {
    int[] fIndex=new int[CHAR];
    Arrays.fill(fIndex,-1);
    int res=Integer.MAX_VALUE;
    for(int i=0;i<str.length();i++){
      int fi=fIndex[str.charAt(i)];
      if(fi==-1)
        fIndex[str.charAt(i)]=i;
      else
        res=Math.min(res,fi);
    }

    return (res==Integer.MAX_VALUE)?-1:res;
  }

  public static void main(String args[])
  {   String str = "abbbcdbc";
    System.out.println("Index of leftmost repeating character:");
    System.out.println(leftMost(str));
  }
}