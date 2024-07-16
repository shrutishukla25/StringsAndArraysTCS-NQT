//REMOVE ALL VOWELS FROM STRING
public class Xstring2 {
    // TC=O(n) SC=O(1)
    public static void main(String[] args) {
        String s = "I am just a girl";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
                continue;
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
/*
 * TC=O(N) SC=O(1)
 * public static String removeVowel(String s) {
 * return s.replaceAll("[AEIOUaeiou]", "");
 * }
 * 
 * public static void main(String[] args) {
 * String s = "I am just a girl";
 * System.out.println(removeVowel(s));
 * }
 */