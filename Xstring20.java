
//Reverse a String
//Using stack
import java.util.*;

//TC=O(n)
//SC= O(n)
public class Xstring20 {
    public static void main(String[] args) {
        // String s = "abba";
        String s = "Hello";
        String revString = "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        while (!st.isEmpty()) {
            revString += st.pop();
        }
        System.out.println(revString);
        System.out.println(s.equals(revString));// Palindrome or not
    }
}
/*
 * public class practice {
 * // TC=O(N)
 * // SC=O(1)
 * public static String swap(String s, int i, int j) {
 * StringBuilder sb = new StringBuilder(s);
 * sb.setCharAt(i, s.charAt(j));
 * sb.setCharAt(j, s.charAt(i));
 * return sb.toString();
 * }
 * 
 * public static void main(String[] args) {
 * String s = "hello";
 * int i = 0;
 * int j = s.length() - 1;
 * while (i < j) {
 * s = swap(s, i, j);
 * i++;
 * j--;
 * }
 * System.out.print("Reversal is " + s);
 * }
 * }
 * 
 */

/*
 * public class practice {
 * public static void main(String[] args) {
 * String s = "hello";
 * StringBuilder sb = new StringBuilder(s);
 * sb.reverse();// TC=O(n) SC=O(1)
 * s = sb.toString();
 * System.out.print("Reversal is " + s);
 * }
 * }
 * 
 */