public class CharFrequency {
  public static void main(String[] args) {
    String s = "banana";

    int[] freq = new int[26];

    // Count frequency
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      freq[c - 'a']++;
    }

    // Print in sorted order
    for (int i = 0; i < 26; i++) {
      if (freq[i] > 0) {
        System.out.println((char)(i + 'a') + " " + freq[i]);
      }
    }
  }
}
