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