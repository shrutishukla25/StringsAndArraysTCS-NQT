
//REMOVE DUPLICATE CHARACTERS FROM STRING
//TC=O(N)
//SC=O(N)
import java.util.*;

//BETTER APPROACH
public class Xstring16 {
    public static void main(String[] args) {
        // String s = "abbcdeddl";
        String s = "geEksforGEeks";
        String res = "";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);

                res += c;
            }

        }
        System.out.println(res);

    }
}
/*
 * public class practice {
 * // BRUTE FORCE
 * // Time Complexity: O(N^2) Space Complexity: O(1)
 * public static void main(String[] args) {
 * String s = "cbacdcbc";
 * String res = "";
 * for (int i = 0; i < s.length(); i++) {
 * int j = 0;
 * for (j = 0; j < i; j++) {
 * if (s.charAt(j) == s.charAt(i)) {
 * break;
 * }
 * }
 * if (i == j) {
 * res += s.charAt(i);
 * }
 * }
 * System.out.println(res);
 * }
 * }
 * 
 */
/*
 * public class practice {
 * // OPTIMISED
 * // Time Complexity: O(N) Space Complexity: O(1)
 * // IT WILL WORK ONLY WITH STRINGS HAVING LOWER CASE
 * public static void main(String[] args) {
 * String s = "cbacdcbc";
 * String res = "";
 * boolean count[] = new boolean[26];
 * // default val of boolean is false
 * // so array at first will be containing false
 * for (int i = 0; i < s.length(); i++) {
 * if (count[s.charAt(i) - 'a'] == false) {
 * res += s.charAt(i);
 * count[s.charAt(i) - 'a'] = true;
 * }
 * }
 * System.out.println(res);
 * }
 * }
 * 
 */